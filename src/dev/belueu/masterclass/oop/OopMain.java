package dev.belueu.masterclass.oop;

import java.math.BigDecimal;

public class OopMain {
    public static void main(String[] args) {
        System.out.println("Hello Main oop1 class!");

        Car porsche = new Car();
        Car holden = new Car();

        porsche.setModel("911");
        System.out.println("Model is: " + porsche.getModel());


        SimpleCalculator simpleCalculator = new SimpleCalculator();

        simpleCalculator.setFirstNumber(5.0);
        simpleCalculator.setSecondNumber(4);

        System.out.println("add = " + simpleCalculator.getAdditionResult());
        System.out.println("subtract = " + simpleCalculator.getSubtractionResult());

        simpleCalculator.setFirstNumber(5.25);
        simpleCalculator.setSecondNumber(0);

        System.out.println("multiply = " + simpleCalculator.getMultiplicationResult());
        System.out.println("devide = " + simpleCalculator.getDivisionResult());


        Person person = new Person();

        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);

        System.out.println("fullName = " + person.getFullName());
        System.out.println("isTeen = " + person.isTeen());

        person.setFirstName("John");
        person.setAge(18);

        System.out.println("fullName = " + person.getFullName());
        System.out.println("isTeen = " + person.isTeen());

        person.setLastName("Smith");

        System.out.println("fullName = " + person.getFullName());

        BankAccount constructorAccount = new BankAccount(
                "RO33RZBR1233123123123RON",
                new BigDecimal("10000"),
                "John Smith",
                "john.smith@gmail.com",
                "+32 333 222 111");

        System.out.println("Account number: " + constructorAccount.getAccountNumber());
        System.out.println("Customer name: " + constructorAccount.getCustomerName());
        System.out.println("Customer email: " + constructorAccount.getEmail());
        System.out.println("Customer phone number: " + constructorAccount.getPhoneNumber());
        System.out.println("Balance: $" + constructorAccount.getBalance());

        constructorAccount.depositMoney(new BigDecimal("3250.55"));

        System.out.println("Balance after deposit: $" + constructorAccount.getBalance());

        constructorAccount.withdrawMoney(new BigDecimal("5250.00"));

        System.out.println("Balance after withdraw: $" + constructorAccount.getBalance());

        constructorAccount.withdrawMoney(new BigDecimal("0.56"));

        System.out.println("Balance: $" + constructorAccount.getBalance());

        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber("RO32RZBR445667433455344RON");
        bankAccount.setCustomerName("Marina Pervades");
        bankAccount.setEmail("marina.me@gmail.com");
        bankAccount.setPhoneNumber("+40 732 111 333");
        bankAccount.setBalance(new BigDecimal("2000.0"));

        System.out.println("Account number: " + bankAccount.getAccountNumber());
        System.out.println("Customer name: " + bankAccount.getCustomerName());
        System.out.println("Customer email: " + bankAccount.getEmail());
        System.out.println("Customer phone number: " + bankAccount.getPhoneNumber());
        System.out.println("Balance: $" + bankAccount.getBalance());

        bankAccount.depositMoney(new BigDecimal("3250.55"));

        System.out.println("Balance after deposit: $" + bankAccount.getBalance());

        bankAccount.withdrawMoney(new BigDecimal("5250.00"));

        System.out.println("Balance after withdraw: $" + bankAccount.getBalance());

        bankAccount.withdrawMoney(new BigDecimal("0.56"));

        System.out.println("Balance: $" + bankAccount.getBalance());

        BankAccount myAccount = new BankAccount("Cristi Belu", "belu.test@gmail.com", "555-1123-2233");

        System.out.println("My Account number: " + myAccount.getAccountNumber() + " \n" + "My Balance: $" + myAccount.getBalance());


        VipCustomer noArgsCustomer = new VipCustomer();
        System.out.println(noArgsCustomer.getName() + " " + noArgsCustomer.getCreditLimit() + " " + noArgsCustomer.getEmail());

        VipCustomer twoArgsCustomer = new VipCustomer(new BigDecimal("100000"), "nick.vip@gmail.com");
        System.out.println(twoArgsCustomer.getName() + " " + twoArgsCustomer.getCreditLimit() + " " + twoArgsCustomer.getEmail());

        VipCustomer allArgsCustomer = new VipCustomer("Penny Gold", new BigDecimal(100_000_000), "penny.gold@gmail.com");
        System.out.println(allArgsCustomer.getName() + " " + allArgsCustomer.getCreditLimit() + " " + allArgsCustomer.getEmail());

        Wall wall = new Wall(5, 4);
        System.out.println("area = " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width = " + wall.getWidth());
        System.out.println("height = " + wall.getHeight());
        System.out.println("area = " + wall.getArea());

        Point first = new Point(6, 5);
        Point second = new Point(3, 1);

        System.out.println("distance(0,0) = " + first.distance());
        System.out.println("distance(second) = " + first.distance(second));
        System.out.println("distance(2,2) = " + first.distance(2, 2));

        Point point = new Point();
        System.out.println("distance() = " + point.distance());

        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);

        System.out.println("total = " + calculator.getTotalCost());

        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total = " + calculator.getTotalCost());

        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);

        one.add(1, 1);
        System.out.println("one.real = " + one.getReal());
        System.out.println("one.imaginary = " + one.getImaginary());

        one.subtract(number);
        System.out.println("one.real = " + one.getReal());
        System.out.println("one.imaginary = " + one.getImaginary());

        number.subtract(one);
        System.out.println("number.real = " + number.getReal());
        System.out.println("number.imaginary = " + number.getImaginary());

    }
}
