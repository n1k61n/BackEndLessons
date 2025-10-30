const QUESTIONS = [
  {
    "q": "1) System.out.println(10 + 20 + \"Java\");",
    "options": [
      "Java30",
      "30Java",
      "1020Java",
      "Java1020",
      "Error"
    ],
    "answer": "30Java",
    "explanation": "Sol tərəfdən sağa oxunur: 10+20 əvvəlcə hesablanır → 30, sonra 'Java' ilə string concatenation olunur → '30Java'."
  },
  {
    "q": "2) System.out.println(\"Java\" + 10 + 20);",
    "options": [
      "Java30",
      "Java1020",
      "30Java",
      "1020Java",
      "Error"
    ],
    "answer": "Java1020",
    "explanation": "String ilə başlayanda bütün əlavə etmələr string kimi edilir: 'Java'+'10' → 'Java10', sonra +20 → 'Java1020'."
  },
  {
    "q": "3) Which keyword is used to inherit a class?",
    "options": [
      "implements",
      "extends",
      "inherits",
      "super",
      "override"
    ],
    "answer": "extends",
    "explanation": "Java-da sinifdən irsiyyət almaq üçün `extends` açar sözü istifadə olunur."
  },
  {
    "q": "4) Which keyword is used to call the parent class constructor?",
    "options": [
      "base",
      "super",
      "parent",
      "extends",
      "this"
    ],
    "answer": "super",
    "explanation": "`super()` çağırışı valideyn (parent) sinifin konstruktorunu işə salır."
  },
  {
    "q": "5) int i=1; while(i<=3){System.out.print(i); i++;}",
    "options": [
      "123",
      "321",
      "111",
      "12",
      "Infinite loop"
    ],
    "answer": "123",
    "explanation": "i 1-dən başlayır və 3-ə kimi artaraq çap olunur: 1 2 3."
  },
  {
    "q": "6) int[] arr=new int[5]; System.out.println(arr[5]);",
    "options": [
      "0",
      "5",
      "null",
      "ArrayIndexOutOfBoundsException",
      "Compilation error"
    ],
    "answer": "ArrayIndexOutOfBoundsException",
    "explanation": "Massiv indeksləri 0-dan başlayır; ötən indeks 4-dür. arr[5] mövcud deyil → ArrayIndexOutOfBoundsException."
  },
  {
    "q": "7) String s1=\"Java\"; String s2=new String(\"Java\"); System.out.println(s1.equals(s2));",
    "options": [
      "true",
      "false",
      "null",
      "Error",
      "0"
    ],
    "answer": "true",
    "explanation": "`equals()` metodu mətnin dəyərini müqayisə edir; hər ikisi 'Java' olduğu üçün true qaytarır."
  },
  {
    "q": "8) Which collection does not allow duplicates?",
    "options": [
      "List",
      "ArrayList",
      "Set",
      "Map",
      "LinkedList"
    ],
    "answer": "Set",
    "explanation": "`Set` kolleksiyası təkrarlanan elementlərə icazə vermir."
  },
  {
    "q": "9) Which interface does not allow duplicate keys?",
    "options": [
      "Map",
      "List",
      "Set",
      "Collection",
      "ArrayList"
    ],
    "answer": "Map",
    "explanation": "`Map` açar-dəyər cütləri saxlayır və açarlar unikaldır (təkrarlana bilməz)."
  },
  {
    "q": "10) int x=5; System.out.println(++x*2);",
    "options": [
      "10",
      "12",
      "8",
      "6",
      "11"
    ],
    "answer": "12",
    "explanation": "Pre-increment `++x` əvvəlcə x-in dəyərini 6 edir, sonra *2 → 12."
  },
  {
    "q": "11) Which class is immutable?",
    "options": [
      "StringBuilder",
      "StringBuffer",
      "String",
      "ArrayList",
      "Object"
    ],
    "answer": "String",
    "explanation": "`String` sinfi dəyişməzdir (immutable); mövcud string üzərində dəyişiklik yeni obyekt yaradır."
  },
  {
    "q": "12) String s=\"Hello\"; s.concat(\"World\"); System.out.println(s);",
    "options": [
      "HelloWorld",
      "Hello World",
      "Hello",
      "Error",
      "null"
    ],
    "answer": "Hello",
    "explanation": "`concat()` yeni string qaytarır, amma s-nin özünü dəyişdirmir. s hələ də 'Hello'-dur."
  },
  {
    "q": "13) int x=10,y=5; System.out.println(x>y?\"Yes\":\"No\");",
    "options": [
      "Yes",
      "No",
      "true",
      "false",
      "Error"
    ],
    "answer": "Yes",
    "explanation": "10 > 5 olduğu üçün şərt doğru olur və 'Yes' çap olunur."
  },
  {
    "q": "14) Purpose of this keyword?",
    "options": [
      "Refers current object",
      "Refers parent",
      "Imports package",
      "Calls static",
      "Declares constant"
    ],
    "answer": "Refers current object",
    "explanation": "`this` cari obyektə istinad etmək üçün istifadə olunur."
  },
  {
    "q": "15) System.exit(0); does what?",
    "options": [
      "Restarts JVM",
      "Stops JVM",
      "Pauses JVM",
      "Throws exception",
      "None"
    ],
    "answer": "Stops JVM",
    "explanation": "`System.exit(0)` JVM-i dayandırır və proqramı bitirir. 0 uğurlu çıxışı göstərir."
  },
  {
    "q": "16) int a=5; System.out.println(a++ + ++a);",
    "options": [
      "11",
      "12",
      "13",
      "10",
      "9"
    ],
    "answer": "12",
    "explanation": "Əvvəl `a++` post-increment dəyəri 5 qaytarır, sonra `++a` a-ni 7 edir və 7 qaytarır? Bunun yox, addımları belədir: a=5; a++ → returns 5, a becomes 6; ++a → increments to 7, returns 7; 5+7=12."
  },
  {
    "q": "17) Which keyword prevents inheritance?",
    "options": [
      "final",
      "static",
      "private",
      "sealed",
      "const"
    ],
    "answer": "final",
    "explanation": "`final` ilə bir sinifə qoyduqda o daha miras alınmaz."
  },
  {
    "q": "18) try{int x=10/0;}catch(Exception e){System.out.println(\"Error\");}",
    "options": [
      "Compile error",
      "Runtime error",
      "Error printed",
      "Infinity",
      "None"
    ],
    "answer": "Error printed",
    "explanation": "10/0 integer bölmə olduğu üçün ArithmeticException atılır və catch blokunda 'Error' çap olunur."
  },
  {
    "q": "19) Which keyword handles exceptions?",
    "options": [
      "if",
      "try",
      "break",
      "switch",
      "throw"
    ],
    "answer": "try",
    "explanation": "`try` blokunda mümkün istisna olan kod yazılır; onunla birlikdə `catch` istifadə olunur."
  },
  {
    "q": "20) Keyword to manually throw exception?",
    "options": [
      "catch",
      "throw",
      "throws",
      "final",
      "error"
    ],
    "answer": "throw",
    "explanation": "`throw` açar sözü ilə istisna obyektini əl ilə atmaq olur."
  },
  {
    "q": "21) finally block does what?",
    "options": [
      "Runs only if error",
      "Runs only if no error",
      "Always runs",
      "Never runs",
      "Optional"
    ],
    "answer": "Always runs",
    "explanation": "`finally` bloku ümumiyyətlə try/catch-dən sonra hər vəziyyətdə çalışır (istisnalar xaricində JVM tərəfindən dayandırılma kimi)."
  },
  {
    "q": "22) Parent class of all classes?",
    "options": [
      "Class",
      "Object",
      "Super",
      "Root",
      "None"
    ],
    "answer": "Object",
    "explanation": "Bütün siniflər Java-da `Object` sinifindən miras alır."
  },
  {
    "q": "23) Access modifier visible everywhere?",
    "options": [
      "protected",
      "private",
      "public",
      "package",
      "final"
    ],
    "answer": "public",
    "explanation": "`public` üzvlər və siniflər hər yerdən görünəndir."
  },
  {
    "q": "24) Which statement creates a thread?",
    "options": [
      "Thread t=new Thread(run());",
      "Thread t=new Thread();",
      "Thread t=new Thread(runnableObj);",
      "Runnable r=new Thread();",
      "Thread.run();"
    ],
    "answer": "Thread t=new Thread(runnableObj);",
    "explanation": "Yeni Thread obyektini `Runnable` implement edən obyektlə yaratmaq düzgündür: `new Thread(runnableObj)`."
  },
  {
    "q": "25) Package containing ArrayList?",
    "options": [
      "java.lang",
      "java.io",
      "java.util",
      "java.net",
      "java.sql"
    ],
    "answer": "java.util",
    "explanation": "`ArrayList` `java.util` paketində yerləşir."
  },
  {
    "q": "26) Which is true about interfaces?",
    "options": [
      "Can have private only",
      "Can have constructors",
      "Can extend a class",
      "Can be implemented by classes",
      "Cannot be used"
    ],
    "answer": "Can be implemented by classes",
    "explanation": "Interface-lər siniflər tərəfindən `implements` ilə həyata keçirilir (implemented)."
  },
  {
    "q": "27) StringBuilder sb=new StringBuilder(\"Hi\"); sb.append(\" Java\"); System.out.println(sb);",
    "options": [
      "Hi",
      "HiJava",
      "Hi Java",
      "Error",
      "null"
    ],
    "answer": "Hi Java",
    "explanation": "`append` stringə boşluqla ' Java' əlavə edir → 'Hi Java'."
  },
  {
    "q": "28) int i=0; do{System.out.print(i); i++;}while(i<3);",
    "options": [
      "012",
      "123",
      "01",
      "0",
      "Infinite loop"
    ],
    "answer": "012",
    "explanation": "Do-while əvvəlcə işləyir: 0,1,2 çap olunur."
  },
  {
    "q": "29) Integer a=128,b=128; System.out.println(a==b);",
    "options": [
      "true",
      "false",
      "null",
      "128",
      "Error"
    ],
    "answer": "false",
    "explanation": "Integer cache -128..127 diapazondadır; 128 üçün yeni obyektlər yaradılır və `==` müqayisəsi reference-ə görə false qaytarır."
  },
  {
    "q": "30) Which creates an object?",
    "options": [
      "Class x;",
      "x=new Class();",
      "new Class();",
      "Class x=new Class();",
      "class();"
    ],
    "answer": "Class x=new Class();",
    "explanation": "`new Class()` obyekt yaradır; onu eyni zamanda dəyişənə təyin etmək üçün `Class x = new Class();` istifadə olunur."
  },
  {
    "q": "31) for(int i=1;i<=3;i++){if(i==2)continue;System.out.print(i);}",
    "options": [
      "12",
      "13",
      "123",
      "23",
      "1"
    ],
    "answer": "13",
    "explanation": "i==2 olduqda `continue` ilə o iterasiya atlanır. Çap olunanlar: 1 və 3 → '13'."
  },
  {
    "q": "32) Default value of boolean variable?",
    "options": [
      "0",
      "1",
      "true",
      "false",
      "null"
    ],
    "answer": "false",
    "explanation": "Boolean-ın default dəyəri false-dur."
  },
  {
    "q": "33) Size of int in Java?",
    "options": [
      "4 bytes",
      "2 bytes",
      "8 bytes",
      "16 bytes",
      "1 byte"
    ],
    "answer": "4 bytes",
    "explanation": "Java-da `int` 4 baytdır (32 bit)."
  },
  {
    "q": "34) System.out.println(5+5+\"5\");",
    "options": [
      "55",
      "105",
      "55 5",
      "10 5",
      "10"
    ],
    "answer": "105",
    "explanation": "5+5 əvvəlcə hesablanır → 10, sonra +\"5\" → '105'."
  },
  {
    "q": "35) Which class reads input from console?",
    "options": [
      "Scanner",
      "Reader",
      "BufferedInput",
      "ConsoleReader",
      "InputStream"
    ],
    "answer": "Scanner",
    "explanation": "`Scanner` tez-tez konsoldan oxumaq üçün istifadə olunur (java.util.Scanner)."
  },
  {
    "q": "36) Keyword for constants?",
    "options": [
      "static",
      "const",
      "final",
      "static final",
      "fixed"
    ],
    "answer": "final",
    "explanation": "Sabitlər üçün `final` istifadə olunur. `static final` ümumi sabit üçün də uyğun olsa da əsas açar sözü `final`dır."
  },
  {
    "q": "37) int a=5/0;",
    "options": [
      "Compile error",
      "Infinity",
      "ArithmeticException",
      "0",
      "none"
    ],
    "answer": "ArithmeticException",
    "explanation": "Tam ədədlə sıfıra bölmə runtime-da `ArithmeticException` atır."
  },
  {
    "q": "38) Nested loop star pattern output?",
    "options": [
      "*",
      "***",
      "(3 rows triangle)",
      "Error",
      "none"
    ],
    "answer": "(3 rows triangle)",
    "explanation": "Verilən suala uyğun olaraq nested loop ilə 3 sətrli ulduz üçbucağı çap olunur (umumi kod nümunəsi belədir)."
  },
  {
    "q": "39) System.out.println(Math.min(5,8));",
    "options": [
      "8",
      "5",
      "13",
      "3",
      "none"
    ],
    "answer": "5",
    "explanation": "`Math.min(5,8)` ən kiçiyini qaytarır → 5."
  },
  {
    "q": "40) Define abstract method:",
    "options": [
      "method(){}",
      "void run();",
      "abstract void run();",
      "static void run();",
      "final void run();"
    ],
    "answer": "abstract void run();",
    "explanation": "Abstract metod bədənsiz və `abstract` açar sözü ilə təyin edilir: `abstract void run();`."
  },
  {
    "q": "41) True about constructors?",
    "options": [
      "Have return type",
      "Called manually",
      "Same name as class",
      "Static",
      "None"
    ],
    "answer": "Same name as class",
    "explanation": "Konstruktorun adı sinifin adı ilə eyni olmalıdır və return tipi yoxdur."
  },
  {
    "q": "42) Collection keeping insertion order?",
    "options": [
      "HashSet",
      "TreeSet",
      "LinkedHashSet",
      "PriorityQueue",
      "HashMap"
    ],
    "answer": "LinkedHashSet",
    "explanation": "`LinkedHashSet` əlavə edilmə ardıcıllığını qoruyur."
  },
  {
    "q": "43) True for HashMap?",
    "options": [
      "Keys can duplicate",
      "Values unique",
      "Keys unique",
      "Ordered",
      "Thread-safe"
    ],
    "answer": "Keys unique",
    "explanation": "`HashMap`-da açarlar unikaldır; eyni açarla yeni dəyər yazılar."
  },
  {
    "q": "44) String s=\"Java\"; System.out.println(s.charAt(2));",
    "options": [
      "J",
      "a",
      "v",
      "A",
      "Error"
    ],
    "answer": "v",
    "explanation": "İndeks 0-based: s.charAt(2) → 'v'."
  },
  {
    "q": "45) Keyword to call parent method?",
    "options": [
      "parent()",
      "super",
      "extends",
      "override",
      "call()"
    ],
    "answer": "super",
    "explanation": "`super.methodName()` ilə valideyn sinifin metodunu çağırmaq olar."
  },
  {
    "q": "46) int a=1,b=2; System.out.println(a++ + ++b);",
    "options": [
      "3",
      "4",
      "5",
      "2",
      "Error"
    ],
    "answer": "4",
    "explanation": "a++ returns 1 (a becomes 2), ++b makes b=3 returns 3 → 1+3=4."
  },
  {
    "q": "47) Which exception is checked?",
    "options": [
      "ArithmeticException",
      "NullPointerException",
      "IOException",
      "RuntimeException",
      "IndexOutOfBounds"
    ],
    "answer": "IOException",
    "explanation": "`IOException` checked exception-dir və ya explicit olaraq catch/throws tələb oluna bilər."
  },
  {
    "q": "48) Which collection uses key-value pairs?",
    "options": [
      "List",
      "Set",
      "Map",
      "Collection",
      "Array"
    ],
    "answer": "Map",
    "explanation": "`Map` açar-dəyər cütləri saxlayır."
  },
  {
    "q": "49) Meaning of static?",
    "options": [
      "Belongs to object",
      "Belongs to class",
      "Used once",
      "Temporary",
      "Constant"
    ],
    "answer": "Belongs to class",
    "explanation": "`static` class səviyyəli üzvdür — obyektlərə deyil sinifə aiddir."
  },
  {
    "q": "50) System.out.println(\"Result: \" + 5*2);",
    "options": [
      "Result: 10",
      "Result: 52",
      "10",
      "52",
      "Error"
    ],
    "answer": "Result: 10",
    "explanation": "Əvvəl 5*2 hesablanır → 10, sonra string concatenation → 'Result: 10'."
  }
];