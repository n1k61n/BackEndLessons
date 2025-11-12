import json
import psycopg2

# 1️⃣ Подключаемся к PostgreSQL
conn = psycopg2.connect(
    host="localhost",
    database="postgres",
    user="postgres",
    password="12345",
)
cur = conn.cursor()

# 2️⃣ Создаём таблицу, если её нет
cur.execute("""
CREATE TABLE IF NOT EXISTS people (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    age INT
)
""")

# 3️⃣ Загружаем JSON-файл
with open("data.json", "r", encoding="utf-8") as f:
    data = json.load(f)

# 4️⃣ Добавляем данные в таблицу
for person in data:
    cur.execute(
        "INSERT INTO people (id, name, age) VALUES (%s, %s, %s) ON CONFLICT (id) DO NOTHING",
        (person["id"], person["name"], person["age"])
    )

# 5️⃣ Сохраняем изменения и закрываем соединение
conn.commit()
cur.close()
conn.close()

print("✅ Данные успешно загружены в PostgreSQL!")
