package com.develogical.golf.hole1;

import com.develogical.golf.Instruction;
import com.develogical.golf.MoveInstruction;
import com.develogical.golf.TurnInstruction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hole1After {
    private List<Instruction> instructions = new ArrayList<Instruction>();
    public List<Instruction> parseCommand(String command) {
        String[] parts = command.split(" ");
        String direction = parts[0];
        int amount = Integer.parseInt(parts[1]);
        return parseDirection(instructions, amount, direction);
    }

    private List<Instruction> parseDirection(List<Instruction> instructions, int amount, String direction) {
        instructions.add(parseInstruction(amount, direction));
        return instructions;
    }

    private Instruction parseInstruction(int amount, String direction) {
        Instruction[] instructions = {new MoveInstruction(amount), new TurnInstruction(amount), new TurnInstruction(-1 * amount)};
        String[] directions = {"forward", "left", "right"};
        return instructions[Arrays.binarySearch(directions, direction)];
    }
}

