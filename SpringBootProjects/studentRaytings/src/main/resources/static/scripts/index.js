const API_URL = 'http://localhost:8080/api/students';

async function fetchStudents() {
    try {
        const response = await fetch(API_URL);
        if (!response.ok) {
            throw new Error('Şagird məlumatları yüklənərkən xəta: ' + response.statusText);
        }
        let students = await response.json();

        // Balın böyükdən kiçiyə sıralanması
        students.sort((a, b) => b.overallScore - a.overallScore);

        renderTable(students);
    } catch (error) {
        document.getElementById('loading').textContent = 'Xəta: ' + error.message;
        console.error("Fetch Error:", error);
    }
}

function renderTable(students) {
    const tableBody = document.getElementById('table-body');
    tableBody.innerHTML = ''; // Cədvəli təmizlə

    students.forEach((student, index) => {
        const position = index + 1;
        const row = tableBody.insertRow();

        // Yer (Position) sütunu
        const posCell = row.insertCell();
        posCell.textContent = position;
        posCell.classList.add('position');

        if (position === 1) posCell.classList.add('top-1');
        else if (position === 2) posCell.classList.add('top-2');
        else if (position === 3) posCell.classList.add('top-3');

        // Digər sütunlar
        row.insertCell().textContent = student.name;
        row.insertCell().textContent = student.overallScore.toFixed(2);
        row.insertCell().textContent = student.examScore;
        row.insertCell().textContent = student.gpaScore;
        row.insertCell().textContent = student.projectScore;
        row.insertCell().textContent = student.activityScore;
    });

    document.getElementById('loading').style.display = 'none';
    document.getElementById('ranking-table').style.display = 'table';
}

fetchStudents();