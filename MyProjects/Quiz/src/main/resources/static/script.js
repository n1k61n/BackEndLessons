// Correct answer indices for the sample questions (0-based)
const answers = {
q1: 1, // Stack
q2: 1, // O(log n)
q3: 3, // new Thread()
q4: 1, // HAVING
q5: 2 // Encapsulation
};


document.getElementById('submitBtn').addEventListener('click', () => {
let score = 0;
let total = Object.keys(answers).length;
for (const key in answers) {
const radios = document.getElementsByName(key);
let selected = -1;
for (let i = 0; i < radios.length; i++) {
if (radios[i].checked) { selected = parseInt(radios[i].value); break; }
}
if (selected === answers[key]) score++;
}
const percent = Math.round((score / total) * 100);
const resultEl = document.getElementById('result');
resultEl.textContent = `Score: ${score}/${total} (${percent}%)`;
});