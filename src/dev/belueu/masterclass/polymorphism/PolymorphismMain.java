package dev.belueu.masterclass.polymorphism;

class Movie {

    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here!";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {

    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "A shark movie";
    }
}

class IndependenceDay extends Movie {

    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "A sci-fi movie with alien invaders";
    }
}

class MazeRunner extends Movie {

    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Escape the maze";
    }
}

class StarWars extends Movie {

    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over the universe";
    }
}

class ForgetableMovie extends Movie {

    public ForgetableMovie() {
        super("Forget This Movie");
    }
}

public class PolymorphismMain {
    public static void main(String[] args) {

        for (int i = 1; i < 11; i ++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " : " + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n");
        }
    }


    public static Movie randomMovie() {
        int randomNum = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated: " + randomNum);

        return switch (randomNum) {
            case 1 -> new Jaws();
            case 2 -> new IndependenceDay();
            case 3 -> new MazeRunner();
            case 4 -> new StarWars();
            case 5 -> new ForgetableMovie();
            default -> null;
        };
    }
}
