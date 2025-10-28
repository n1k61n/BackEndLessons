package org.example;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class QuizController {

    private final List<Question> questions = new ArrayList<>();

    public QuizController() {
        // Fill questions list using the 50 questions from the file, with correct answers.
        // Format: id, text, options (A..E), correct letter.
        questions.add(new Question(1, "Which method is the entry point of a Java program?",
                Arrays.asList("start()", "run()", "main()", "execute()", "init()"), "C"));
        questions.add(new Question(2, "What is the correct signature of the main method?",
                Arrays.asList("public static void main(String args)", "public static void main(String[] args)",
                        "void main(String[] args)", "static public main(String args[])", "main(String[] args)"), "B"));
        questions.add(new Question(3, "Which of these is not a primitive data type?",
                Arrays.asList("int", "boolean", "double", "String", "char"), "D"));
        questions.add(new Question(4, "What will this code print? int x = 10; System.out.println(x + 5);",
                Arrays.asList("10", "15", "x+5", "105", "Error"), "B"));
        questions.add(new Question(5, "Which keyword defines a class?",
                Arrays.asList("object", "class", "define", "structure", "new"), "B"));
        questions.add(new Question(6, "What is printed? System.out.println(\"Java\" + \" Rocks!\");",
                Arrays.asList("Java Rocks!", "JavaRocks!", "Rocks Java!", "Error", "null"), "A"));
        questions.add(new Question(7, "Which statement is used for decision making?",
                Arrays.asList("switch", "choose", "decide", "pick", "loop"), "A"));
        questions.add(new Question(8, "How do you read input?",
                Arrays.asList("Scanner input = new Scanner(System.in);", "Read.input();", "Input.read();", "Console.read();", "System.in.print()"), "A"));
        questions.add(new Question(9, "Default value of int in a class?",
                Arrays.asList("1", "0", "null", "undefined", "error"), "B"));
        questions.add(new Question(10, "Symbol for single-line comment?",
                Arrays.asList("//", "/* */", "#", "--", ";;"), "A"));
        questions.add(new Question(11, "Which operator compares values?",
                Arrays.asList("=", "==", "===", ":=", "equals"), "B"));
        questions.add(new Question(12, "Output? int a=5; a+=3; System.out.println(a);",
                Arrays.asList("3", "5", "8", "15", "Error"), "C"));
        questions.add(new Question(13, "Which loop executes at least once?",
                Arrays.asList("for", "while", "do-while", "foreach", "until"), "C"));
        questions.add(new Question(14, "Correct way to create array of 5 ints?",
                Arrays.asList("int arr[5];", "int[5] arr;", "int[] arr = new int[5];", "array<int> a;", "arr=int(5);"), "C"));
        questions.add(new Question(15, "What will print? String s=\"Hello\"; System.out.println(s.length());",
                Arrays.asList("4", "5", "6", "Error", "null"), "B"));
        questions.add(new Question(16, "Output? int[] nums={2,4,6}; System.out.println(nums[1]);",
                Arrays.asList("2", "4", "6", "1", "Error"), "B"));
        questions.add(new Question(17, "Keyword for inheritance?",
                Arrays.asList("extend", "inherits", "extends", "super", "override"), "C"));
        questions.add(new Question(18, "Access only inside class?",
                Arrays.asList("private", "public", "protected", "default", "final"), "A"));
        questions.add(new Question(19, "Output? boolean a=true,b=false; System.out.println(a&&b);",
                Arrays.asList("true", "false", "1", "0", "error"), "B"));
        questions.add(new Question(20, "Strings in Java are:",
                Arrays.asList("mutable", "immutable", "numbers", "arrays", "primitive"), "B"));
        questions.add(new Question(21, "Output? int x=5,y=10; System.out.println(y/x);",
                Arrays.asList("2", "2.0", "0", "Error", "15"), "A"));
        questions.add(new Question(22, "Automatically imported package?",
                Arrays.asList("java.io", "java.lang", "java.util", "java.text", "java.math"), "B"));
        questions.add(new Question(23, "Create object?",
                Arrays.asList("Car myCar();", "Car myCar = new Car();", "new Car myCar();", "Car myCar = Car();", "Car();"), "B"));
        questions.add(new Question(24, "Declare constant?",
                Arrays.asList("final int x=10;", "int const x=10;", "static x=10;", "constant x=10;", "const int x;"), "A"));
        questions.add(new Question(25, "Constructor has:",
                Arrays.asList("void keyword", "same name as class", "return type", "static keyword", "none"), "B"));
        questions.add(new Question(26, "Compare two strings?",
                Arrays.asList("==", "equals()", "compare()", "same()", "match()"), "B"));
        questions.add(new Question(27, "Output? for(int i=0;i<3;i++) System.out.print(i+\" \");",
                Arrays.asList("0 1 2", "1 2 3", "0 1 2 3", "3 2 1", "none"), "A"));
        questions.add(new Question(28, "Result of 7 % 3?",
                Arrays.asList("0", "1", "2", "3", "4"), "B"));
        questions.add(new Question(29, "Divide by zero (int)?",
                Arrays.asList("Infinity", "0", "Runtime error", "Compile error", "NaN"), "C"));
        questions.add(new Question(30, "Print Hello World?",
                Arrays.asList("print(\"Hello World\");", "System.out.println(\"Hello World\");", "echo(\"Hello\");", "Console.Write();", "log(\"Hello\");"), "B"));
        questions.add(new Question(31, "What is `this` keyword used for?",
                Arrays.asList("To call main", "To refer current object", "To create new class", "To import packages", "None"), "B"));
        questions.add(new Question(32, "Which one is NOT a loop?",
                Arrays.asList("for", "do", "repeat", "while", "foreach"), "C"));
        questions.add(new Question(33, "How to stop a loop early?",
                Arrays.asList("break", "stop", "exit", "continue", "end"), "A"));
        questions.add(new Question(34, "What is `System.out`?",
                Arrays.asList("Variable", "Object of PrintStream", "Method", "Class", "Package"), "B"));
        questions.add(new Question(35, "Wrapper class for int?",
                Arrays.asList("Integer", "IntWrapper", "Number", "Double", "Character"), "A"));
        questions.add(new Question(36, "Which keyword prevents inheritance?",
                Arrays.asList("static", "final", "const", "private", "abstract"), "B"));
        questions.add(new Question(37, "What is output? String s=\"abc\"; s.toUpperCase(); System.out.println(s);",
                Arrays.asList("abc", "ABC", "Abc", "error", "null"), "A"));
        questions.add(new Question(38, "What will print? int x=5; if(x>3) System.out.println(\"Yes\"); else System.out.println(\"No\");",
                Arrays.asList("Yes", "No", "Error", "true", "false"), "A"));
        questions.add(new Question(39, "Which converts String to int?",
                Arrays.asList("Integer.parseInt()", "toInt()", "valueOfInt()", "cast()", "convert()"), "A"));
        questions.add(new Question(40, "Correct logical AND operator?",
                Arrays.asList("&", "&&", "and", "||", "^^"), "B"));
        questions.add(new Question(41, "Array index starts from?",
                Arrays.asList("0", "1", "-1", "any", "none"), "A"));
        questions.add(new Question(42, "How to print without new line?",
                Arrays.asList("System.out.print()", "println()", "write()", "echo()", "log()"), "A"));
        questions.add(new Question(43, "What will be output? int x=10; System.out.println(x++);",
                Arrays.asList("10", "11", "Error", "9", "none"), "A"));
        questions.add(new Question(44, "Keyword to define constant value?",
                Arrays.asList("const", "final", "static", "fix", "lock"), "B"));
        questions.add(new Question(45, "What is JVM?",
                Arrays.asList("Java Virtual Machine", "Java Version Manager", "Java Visual Mode", "None", "JSON Value Model"), "A"));
        questions.add(new Question(46, "Which data type holds true/false?",
                Arrays.asList("bit", "yesno", "boolean", "int", "char"), "C"));
        questions.add(new Question(47, "What is output? String a=\"Java\"; String b=\"Java\"; System.out.println(a==b);",
                Arrays.asList("true", "false", "null", "error", "none"), "A"));
        questions.add(new Question(48, "What is used to handle exceptions?",
                Arrays.asList("if-else", "try-catch", "switch", "exit()", "debug()"), "B"));
        questions.add(new Question(49, "What is a superclass?",
                Arrays.asList("Class that inherits", "Class that is inherited", "Interface", "Abstract", "Method"), "B"));
        questions.add(new Question(50, "Output? int[] arr = new int[3]; System.out.println(arr.length);",
                Arrays.asList("2", "3", "4", "0", "Error"), "B"));
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("questions", questions);
        return "index";
    }

    @PostMapping("/result")
    public String result(HttpServletRequest request, Model model) {
        int correct = 0;
        int total = questions.size();
        List<Integer> wrongList = new ArrayList<>();

        for (Question q : questions) {
            String paramName = "q" + q.getId();
            String answer = request.getParameter(paramName);
            if (answer != null && answer.equalsIgnoreCase(q.getCorrect())) {
                correct++;
            } else {
                wrongList.add(q.getId());
            }
        }

        int wrong = total - correct;
        model.addAttribute("correct", correct);
        model.addAttribute("wrong", wrong);
        model.addAttribute("total", total);
        model.addAttribute("wrongList", wrongList);
        return "result";
    }
}
