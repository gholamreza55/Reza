package record;

public record EmployeeRecord(String name, int emoloyeeNumber) implements Runnable {
    public EmployeeRecord(String name, int emoloyeeNumber) {
        if (emoloyeeNumber < 0){
            throw new IllegalArgumentException("emoloyeeNumber cannot negative");
             }
        this.name = name;
        this.emoloyeeNumber = emoloyeeNumber;

    }

    public String nametoUpperCase(){
        return name.toUpperCase();
    }
    public static void printWhatever(){
        System.out.println("Whatever");
    }
    public static final String DEFAULT_EMPLOYEE_NAME = "Alireza";

    @Override
    public void run() {
        System.out.println("going......");
    }
}
