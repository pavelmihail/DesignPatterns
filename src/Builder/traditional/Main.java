package Builder.traditional;

/*
    TO do:
    - declare builder interface
    - create multiple builders
    - create director that can work with different builders
    - in client code instantiate director and concrete implementation of the builder to build new objects
 */

public class Main {
    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector(new CheapComputerBuilder());

        director.setComputerBuilder(new CheapComputerBuilder());
        director.buildComputer();
        Computer computer = director.getComputer();
        System.out.println(computer);

        director.setComputerBuilder(new ExpensiveComputerBuilder());
        director.buildComputer();
        computer = director.getComputer();
        System.out.println(computer);
    }
}
