class GoodMorning extends Thread {
    public void run() {
        while (true) {
            try {
                System.out.println("Good Morning");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error");
            }
        }
    }
}

class Hello extends Thread {
    public void run() {
        while (true) {
            try {
                System.out.println("Hello");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Error");
            }
        }
    }
}

class Welcome extends Thread {
    public void run() {
        while (true) {
            try {
                System.out.println("Welcome");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("Error");
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        GoodMorning obj1 = new GoodMorning();
        Hello obj2 = new Hello();
        Welcome obj3 = new Welcome();

        obj1.start();
        obj2.start();
        obj3.start();
    }
}