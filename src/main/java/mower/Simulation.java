package mower;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Simulation {

    public static final char LEFT = 'L';
    public static final char RIGHT = 'R';
    public static final char FORWARD = 'F';

    private String file;

    public Simulation(String file) {
        this.file = file;
    }


    public ArrayList<Mower> play() throws FileNotFoundException {

        ArrayList<Mower> mowers = new ArrayList<>();
        ArrayList<String> commands = readFile();
        if (commands.size() == 0) {
            return mowers;
        }

        String surface = commands.get(0);
        String[] coordinates = surface.split("");
        int xMax = Integer.parseInt(coordinates[0]);
        int yMax = Integer.parseInt(coordinates[1]);

        for (int i = 1; i < commands.size(); i = i + 2) {
            String mowerPosition = commands.get(i);
            Mower mower = getMowerFromCmd(mowerPosition);
            Lawn lawn = new Lawn(xMax, yMax, mower);
            Mower move = move(lawn, commands.get(i + 1));
            mowers.add(move);

        }
        return mowers;
    }

    private Mower getMowerFromCmd(String mowerPosition) {
        String[] positions = mowerPosition.split("");
        int mowerX = Integer.parseInt(positions[0]);
        int mowerY = Integer.parseInt(positions[1]);
        Direction mowerDirection = Direction.get(positions[2]);
        return new Mower(mowerX, mowerY, mowerDirection);
    }


    private Mower move(Lawn lawn, String command) {
        Mower mower = lawn.getMower();
        char[] moves = command.toCharArray();
        for (char move : moves) {
            if (LEFT == move) {
                mower = mower.onLeft();
            } else if (RIGHT == move) {
                mower = mower.onRight();
            } else if (FORWARD == move) {
                mower = mower.forward();
            }
            if (!mower.isOnLawn(lawn)) {
                mower = lawn.getMower();
            }
        }
        return mower;
    }

    private ArrayList<String> readFile() throws FileNotFoundException {
        String line;
        String separator = "/n";
        ArrayList<String> commands = new ArrayList<>();
        try (
                BufferedReader br = new BufferedReader(new FileReader(file))) {
            while ((line = br.readLine()) != null) {
                String[] content = line.split(separator);
                String command = content[0];
                commands.add(command);
            }
        } catch (IOException e) {
            throw new FileNotFoundException();
        }
        return commands;
    }
}
