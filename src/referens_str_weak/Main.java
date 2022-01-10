package referens_str_weak;

import java.lang.ref.WeakReference;

public class Main {
    public static void main(String[] args) {
        // какой-то объект
        Student student = new Student();
        student.d();

// слабая ссылка на него
        WeakReference<Student> weakStudent = new WeakReference<Student>(student);

// теперь объект Student может быть собран сборщиком мусора
        //student = null;

        System.out.println(weakStudent);
    }
}

class Student {
    int a = 14;

    void d() {
        System.out.println(a);
    }
}