package JavaRushTask.JR_5;
 class LocalVariables {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("Age is: " + person.age);
        person.adjustAge(person.age);
        System.out.println("Adjusted age is: " + person.age);
    }

    public static class Person {
        public int age = 20;

        public void adjustAge(int age) {
            this.age = this.age + 30;
            System.out.println("Age in adjustAge() is: " + (this.age-age));
        }
    }
}
