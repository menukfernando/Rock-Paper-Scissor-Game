import java.util.Random;
import java.util.Scanner;

public class RPSGame {
    public static void main(String[] args) {
        String[] rps = {"rock", "paper", "scissor"};
        String computerMove = rps[new Random().nextInt(rps.length)];


    }
}
