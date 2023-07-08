package cubescrimer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import javax.swing.*;

/**
 *
 * @author Tilen
 */
public class CubeScrimer {
    public static final double SQUARE_SIZE = 1.4;
    public static final int TIMER_DELAY = 100;
    private static int elapsedTime = 0;

    public static ArrayList<HashMap<String, CubeFace>> allCubeOrientations() {
        ArrayList<HashMap<String, CubeFace>> all = new ArrayList<>();
        HashMap<String, CubeFace> cfmap;
        //top:white
        cfmap = new HashMap<>();
        cfmap.put("up", new CubeFace("white"));
        cfmap.put("front", new CubeFace("green"));
        cfmap.put("down", new CubeFace("yellow"));
        cfmap.put("back", new CubeFace("blue"));
        cfmap.put("left", new CubeFace("orange"));
        cfmap.put("right", new CubeFace("red"));
        all.add(cfmap);
        
        cfmap = new HashMap<>();
        cfmap.put("up", new CubeFace("white"));
        cfmap.put("front", new CubeFace("red"));
        cfmap.put("down", new CubeFace("yellow"));
        cfmap.put("back", new CubeFace("orange"));
        cfmap.put("left", new CubeFace("green"));
        cfmap.put("right", new CubeFace("blue"));
        all.add(cfmap);
        
        cfmap = new HashMap<>();
        cfmap.put("up", new CubeFace("white"));
        cfmap.put("front", new CubeFace("blue"));
        cfmap.put("down", new CubeFace("yellow"));
        cfmap.put("back", new CubeFace("green"));
        cfmap.put("left", new CubeFace("red"));
        cfmap.put("right", new CubeFace("orange"));
        all.add(cfmap);
        
        cfmap = new HashMap<>();
        cfmap.put("up", new CubeFace("white"));
        cfmap.put("front", new CubeFace("orange"));
        cfmap.put("down", new CubeFace("yellow"));
        cfmap.put("back", new CubeFace("red"));
        cfmap.put("left", new CubeFace("blue"));
        cfmap.put("right", new CubeFace("green"));
        all.add(cfmap);
        //top:yellow
        cfmap = new HashMap<>();
        cfmap.put("up", new CubeFace("yellow"));
        cfmap.put("front", new CubeFace("green"));
        cfmap.put("down", new CubeFace("white"));
        cfmap.put("back", new CubeFace("blue"));
        cfmap.put("left", new CubeFace("red"));
        cfmap.put("right", new CubeFace("orange"));
        all.add(cfmap);
        
        cfmap = new HashMap<>();
        cfmap.put("up", new CubeFace("yellow"));
        cfmap.put("front", new CubeFace("orange"));
        cfmap.put("down", new CubeFace("white"));
        cfmap.put("back", new CubeFace("red"));
        cfmap.put("left", new CubeFace("green"));
        cfmap.put("right", new CubeFace("blue"));
        all.add(cfmap);
        
        cfmap = new HashMap<>();
        cfmap.put("up", new CubeFace("yellow"));
        cfmap.put("front", new CubeFace("blue"));
        cfmap.put("down", new CubeFace("white"));
        cfmap.put("back", new CubeFace("green"));
        cfmap.put("left", new CubeFace("orange"));
        cfmap.put("right", new CubeFace("red"));
        all.add(cfmap);
        
        cfmap = new HashMap<>();
        cfmap.put("up", new CubeFace("yellow"));
        cfmap.put("front", new CubeFace("red"));
        cfmap.put("down", new CubeFace("white"));
        cfmap.put("back", new CubeFace("orange"));
        cfmap.put("left", new CubeFace("blue"));
        cfmap.put("right", new CubeFace("green"));
        all.add(cfmap);
        //top:green
        cfmap = new HashMap<>();
        cfmap.put("up", new CubeFace("green"));
        cfmap.put("front", new CubeFace("white"));
        cfmap.put("down", new CubeFace("blue"));
        cfmap.put("back", new CubeFace("yellow"));
        cfmap.put("left", new CubeFace("red"));
        cfmap.put("right", new CubeFace("orange"));
        all.add(cfmap);
        
        cfmap = new HashMap<>();
        cfmap.put("up", new CubeFace("green"));
        cfmap.put("front", new CubeFace("orange"));
        cfmap.put("down", new CubeFace("blue"));
        cfmap.put("back", new CubeFace("red"));
        cfmap.put("left", new CubeFace("white"));
        cfmap.put("right", new CubeFace("yellow"));
        all.add(cfmap);
        
        cfmap = new HashMap<>();
        cfmap.put("up", new CubeFace("green"));
        cfmap.put("front", new CubeFace("yellow"));
        cfmap.put("down", new CubeFace("blue"));
        cfmap.put("back", new CubeFace("white"));
        cfmap.put("left", new CubeFace("orange"));
        cfmap.put("right", new CubeFace("red"));
        all.add(cfmap);
        
        cfmap = new HashMap<>();
        cfmap.put("up", new CubeFace("green"));
        cfmap.put("front", new CubeFace("red"));
        cfmap.put("down", new CubeFace("blue"));
        cfmap.put("back", new CubeFace("orange"));
        cfmap.put("left", new CubeFace("yellow"));
        cfmap.put("right", new CubeFace("white"));
        all.add(cfmap);
        //top:red
        cfmap = new HashMap<>();
        cfmap.put("up", new CubeFace("red"));
        cfmap.put("front", new CubeFace("green"));
        cfmap.put("down", new CubeFace("orange"));
        cfmap.put("back", new CubeFace("blue"));
        cfmap.put("left", new CubeFace("white"));
        cfmap.put("right", new CubeFace("yellow"));
        all.add(cfmap);
        
        cfmap = new HashMap<>();
        cfmap.put("up", new CubeFace("red"));
        cfmap.put("front", new CubeFace("yellow"));
        cfmap.put("down", new CubeFace("orange"));
        cfmap.put("back", new CubeFace("white"));
        cfmap.put("left", new CubeFace("green"));
        cfmap.put("right", new CubeFace("blue"));
        all.add(cfmap);
        
        cfmap = new HashMap<>();
        cfmap.put("up", new CubeFace("red"));
        cfmap.put("front", new CubeFace("blue"));
        cfmap.put("down", new CubeFace("orange"));
        cfmap.put("back", new CubeFace("green"));
        cfmap.put("left", new CubeFace("yellow"));
        cfmap.put("right", new CubeFace("white"));
        all.add(cfmap);
        
        cfmap = new HashMap<>();
        cfmap.put("up", new CubeFace("red"));
        cfmap.put("front", new CubeFace("white"));
        cfmap.put("down", new CubeFace("orange"));
        cfmap.put("back", new CubeFace("yellow"));
        cfmap.put("left", new CubeFace("blue"));
        cfmap.put("right", new CubeFace("green"));
        all.add(cfmap);
        //top:blue
        cfmap = new HashMap<>();
        cfmap.put("up", new CubeFace("blue"));
        cfmap.put("front", new CubeFace("white"));
        cfmap.put("down", new CubeFace("green"));
        cfmap.put("back", new CubeFace("yellow"));
        cfmap.put("left", new CubeFace("orange"));
        cfmap.put("right", new CubeFace("red"));
        all.add(cfmap);
        
        cfmap = new HashMap<>();
        cfmap.put("up", new CubeFace("blue"));
        cfmap.put("front", new CubeFace("red"));
        cfmap.put("down", new CubeFace("green"));
        cfmap.put("back", new CubeFace("orange"));
        cfmap.put("left", new CubeFace("white"));
        cfmap.put("right", new CubeFace("yellow"));
        all.add(cfmap);
        
        cfmap = new HashMap<>();
        cfmap.put("up", new CubeFace("blue"));
        cfmap.put("front", new CubeFace("yellow"));
        cfmap.put("down", new CubeFace("green"));
        cfmap.put("back", new CubeFace("white"));
        cfmap.put("left", new CubeFace("red"));
        cfmap.put("right", new CubeFace("orange"));
        all.add(cfmap);
        
        cfmap = new HashMap<>();
        cfmap.put("up", new CubeFace("blue"));
        cfmap.put("front", new CubeFace("orange"));
        cfmap.put("down", new CubeFace("green"));
        cfmap.put("back", new CubeFace("red"));
        cfmap.put("left", new CubeFace("yellow"));
        cfmap.put("right", new CubeFace("white"));
        all.add(cfmap);
        //top:orange
        cfmap = new HashMap<>();
        cfmap.put("up", new CubeFace("orange"));
        cfmap.put("front", new CubeFace("green"));
        cfmap.put("down", new CubeFace("red"));
        cfmap.put("back", new CubeFace("blue"));
        cfmap.put("left", new CubeFace("yellow"));
        cfmap.put("right", new CubeFace("white"));
        all.add(cfmap);
        
        cfmap = new HashMap<>();
        cfmap.put("up", new CubeFace("orange"));
        cfmap.put("front", new CubeFace("white"));
        cfmap.put("down", new CubeFace("red"));
        cfmap.put("back", new CubeFace("yellow"));
        cfmap.put("left", new CubeFace("green"));
        cfmap.put("right", new CubeFace("blue"));
        all.add(cfmap);
        
        cfmap = new HashMap<>();
        cfmap.put("up", new CubeFace("orange"));
        cfmap.put("front", new CubeFace("blue"));
        cfmap.put("down", new CubeFace("red"));
        cfmap.put("back", new CubeFace("green"));
        cfmap.put("left", new CubeFace("white"));
        cfmap.put("right", new CubeFace("yellow"));
        all.add(cfmap);
        
        cfmap = new HashMap<>();
        cfmap.put("up", new CubeFace("orange"));
        cfmap.put("front", new CubeFace("yellow"));
        cfmap.put("down", new CubeFace("red"));
        cfmap.put("back", new CubeFace("white"));
        cfmap.put("left", new CubeFace("blue"));
        cfmap.put("right", new CubeFace("green"));
        all.add(cfmap);

        return all;
    }

    static Cube scrambleCube(Cube c, int scrambleLength) {
        Random rnd = new Random();
        int current;
        int previous = 12;
        int illegal = 13;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < scrambleLength; i++) {
            current = rnd.nextInt(12);
            switch (previous) {
                case 0:
                    while (current == 1 || current == illegal) {
                        current = rnd.nextInt(12);
                    }
                    break;
                case 1:
                    while (current == 0 || current == illegal) {
                        current = rnd.nextInt(12);
                    }
                    break;
                case 2:
                    while (current == 3 || current == illegal) {
                        current = rnd.nextInt(12);
                    }
                    break;
                case 3:
                    while (current == 2 || current == illegal) {
                        current = rnd.nextInt(12);
                    }
                    break;
                case 4:
                    while (current == 5 || current == illegal) {
                        current = rnd.nextInt(12);
                    }
                    break;
                case 5:
                    while (current == 4 || current == illegal) {
                        current = rnd.nextInt(12);
                    }
                    break;
                case 6:
                    while (current == 7 || current == illegal) {
                        current = rnd.nextInt(12);
                    }
                    break;
                case 7:
                    while (current == 6 || current == illegal) {
                        current = rnd.nextInt(12);
                    }
                    break;
                case 8:
                    while (current == 9 || current == illegal) {
                        current = rnd.nextInt(12);
                    }
                    break;
                case 9:
                    while (current == 8 || current == illegal) {
                        current = rnd.nextInt(12);
                    }
                    break;
                case 10:
                    while (current == 11 || current == illegal) {
                        current = rnd.nextInt(12);
                    }
                    break;
                case 11:
                    while (current == 10 || current == illegal) {
                        current = rnd.nextInt(12);
                    }
                    break;
            }
            illegal = 13;
            switch (current) {
                case 0:
                    c.upMove();
                    if (current == previous) {
                        illegal = current;
                        sb.replace(sb.length()-2, sb.length(), "U2");
                        sb.append(i == scrambleLength - 1 ? "" : " ");
                    } else {
                        sb.append("U").append(i == scrambleLength - 1 ? "" : " ");
                    }
                    break;
                case 1:
                    c.upPrimeMove();
                    if (current == previous) {
                        illegal = current;
                        sb.replace(sb.length()-3, sb.length(), "U2");
                        sb.append(i == scrambleLength - 1 ? "" : " ");
                    } else {
                        sb.append("U'").append(i == scrambleLength - 1 ? "" : " ");
                    }
                    break;
                case 2:
                    c.downMove();
                    if (current == previous) {
                        illegal = current;
                        sb.replace(sb.length()-2, sb.length(), "D2");
                        sb.append(i == scrambleLength - 1 ? "" : " ");
                    } else {
                        sb.append("D").append(i == scrambleLength - 1 ? "" : " ");
                    }
                    break;
                case 3:
                    c.downPrimeMove();
                    if (current == previous) {
                        illegal = current;
                        sb.replace(sb.length()-3, sb.length(), "D2");
                        sb.append(i == scrambleLength - 1 ? "" : " ");
                    } else {
                        sb.append("D'").append(i == scrambleLength - 1 ? "" : " ");
                    }
                    break;
                case 4:
                    c.leftMove();
                    if (current == previous) {
                        illegal = current;
                        sb.replace(sb.length()-2, sb.length(), "L2");
                        sb.append(i == scrambleLength - 1 ? "" : " ");
                    } else {
                        sb.append("L").append(i == scrambleLength - 1 ? "" : " ");
                    }
                    break;
                case 5:
                    c.leftPrimeMove();
                    if (current == previous) {
                        illegal = current;
                        sb.replace(sb.length()-3, sb.length(), "L2");
                        sb.append(i == scrambleLength - 1 ? "" : " ");
                    } else {
                        sb.append("L'").append(i == scrambleLength - 1 ? "" : " ");
                    }
                    break;
                case 6:
                    c.rightMove();
                    if (current == previous) {
                        illegal = current;
                        sb.replace(sb.length()-2, sb.length(), "R2");
                        sb.append(i == scrambleLength - 1 ? "" : " ");
                    } else {
                        sb.append("R").append(i == scrambleLength - 1 ? "" : " ");
                    }
                    break;
                case 7:
                    c.rightPrimeMove();
                    if (current == previous) {
                        illegal = current;
                        sb.replace(sb.length()-3, sb.length(), "R2");
                        sb.append(i == scrambleLength - 1 ? "" : " ");
                    } else {
                        sb.append("R'").append(i == scrambleLength - 1 ? "" : " ");
                    }
                    break;
                case 8:
                    c.frontMove();
                    if (current == previous) {
                        illegal = current;
                        sb.replace(sb.length()-2, sb.length(), "F2");
                        sb.append(i == scrambleLength - 1 ? "" : " ");
                    } else {
                        sb.append("F").append(i == scrambleLength - 1 ? "" : " ");
                    }
                    break;
                case 9:
                    c.frontPrimeMove();
                    if (current == previous) {
                        illegal = current;
                        sb.replace(sb.length()-3, sb.length(), "F2");
                        sb.append(i == scrambleLength - 1 ? "" : " ");
                    } else {
                        sb.append("F'").append(i == scrambleLength - 1 ? "" : " ");
                    }
                    break;
                case 10:
                    c.backMove();
                    if (current == previous) {
                        illegal = current;
                        sb.replace(sb.length()-2, sb.length(), "B2");
                        sb.append(i == scrambleLength - 1 ? "" : " ");
                    } else {
                        sb.append("B").append(i == scrambleLength - 1 ? "" : " ");
                    }
                    break;
                case 11:
                    c.backPrimeMove();
                    if (current == previous) {
                        illegal = current;
                        sb.replace(sb.length()-3, sb.length(), "B2");
                        sb.append(i == scrambleLength - 1 ? "" : " ");
                    } else {
                        sb.append("B'").append(i == scrambleLength - 1 ? "" : " ");
                    }
                    break;
            }
            previous = current;
        }
        c.setScramble(sb.toString());
        return c;
    }
    
    public static Color getColor(String color) {
        switch (color) {
            case "white":
                return Color.WHITE;
            case "yellow":
                return Color.YELLOW;
            case "green":
                return Color.GREEN;
            case "blue":
                return new Color(0, 100, 255);
            case "red":
                return Color.RED;
            case "orange":
                return new Color(250, 130, 0);
            default:
                return null;
        }
    }
    
    public static void redrawElements(JFrame window, Cube c, int scrambleLength, JPanel cubePanel, JTextField scrambleLabel, JTextField orientationLabel) {
        GridBagConstraints gbc;
        
        scrambleCube(c, scrambleLength);
        
        scrambleLabel.setText(c.getScramble());
        orientationLabel.setText(c.getOrientation());
        
        cubePanel.removeAll();
        
        JPanel cubeUpPanel = new JPanel(new GridBagLayout());
        cubeUpPanel.setBackground(Color.darkGray);
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                final int counti = i;
                final int countj = j;
                JPanel cubeletP = new JPanel() {
                    @Override
                    protected void paintComponent(Graphics g) {
                        super.paintComponent(g);

                        // Set the color for the square
                        g.setColor(getColor(c.cubeMap.get("up").getFacePiece(countj, counti)));

                        // Calculate the size and position of the square
                        int squareSize = (int) (Math.min(getWidth(), getHeight()) / SQUARE_SIZE);
                        int x = (int) ((getWidth() - squareSize) / SQUARE_SIZE);
                        int y = (int) ((getHeight() - squareSize) / SQUARE_SIZE);

                        // Draw the square
                        g.fillRect(x, y, squareSize, squareSize);
                    }
                };
                cubeletP.setBackground(Color.darkGray);
                gbc = new GridBagConstraints();
                gbc.gridx=counti;
                gbc.gridy=countj;
                gbc.fill=GridBagConstraints.BOTH;
                gbc.weightx=1;
                gbc.weighty=1;
                cubeUpPanel.add(cubeletP, gbc);
            }
        }
        
        JPanel cubeDownPanel = new JPanel(new GridBagLayout());
        cubeDownPanel.setBackground(Color.darkGray);
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                final int counti = i;
                final int countj = j;
                JPanel cubeletP = new JPanel() {
                    @Override
                    protected void paintComponent(Graphics g) {
                        super.paintComponent(g);

                        // Set the color for the square
                        g.setColor(getColor(c.cubeMap.get("down").getFacePiece(countj, counti)));

                        // Calculate the size and position of the square
                        int squareSize = (int) (Math.min(getWidth(), getHeight()) / SQUARE_SIZE);
                        int x = (int) ((getWidth() - squareSize) / SQUARE_SIZE);
                        int y = (int) ((getHeight() - squareSize) / SQUARE_SIZE);

                        // Draw the square
                        g.fillRect(x, y, squareSize, squareSize);
                    }
                };
                cubeletP.setBackground(Color.darkGray);
                gbc = new GridBagConstraints();
                gbc.gridx=counti;
                gbc.gridy=countj;
                gbc.fill=GridBagConstraints.BOTH;
                gbc.weightx=1;
                gbc.weighty=1;
                cubeDownPanel.add(cubeletP, gbc);
            }
        }
        
        JPanel cubeFrontPanel = new JPanel(new GridBagLayout());
        cubeFrontPanel.setBackground(Color.darkGray);
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                final int counti = i;
                final int countj = j;
                JPanel cubeletP = new JPanel() {
                    @Override
                    protected void paintComponent(Graphics g) {
                        super.paintComponent(g);

                        // Set the color for the square
                        g.setColor(getColor(c.cubeMap.get("front").getFacePiece(countj, counti)));

                        // Calculate the size and position of the square
                        int squareSize = (int) (Math.min(getWidth(), getHeight()) / SQUARE_SIZE);
                        int x = (int) ((getWidth() - squareSize) / SQUARE_SIZE);
                        int y = (int) ((getHeight() - squareSize) / SQUARE_SIZE);

                        // Draw the square
                        g.fillRect(x, y, squareSize, squareSize);
                    }
                };
                cubeletP.setBackground(Color.darkGray);
                gbc = new GridBagConstraints();
                gbc.gridx=counti;
                gbc.gridy=countj;
                gbc.fill=GridBagConstraints.BOTH;
                gbc.weightx=1;
                gbc.weighty=1;
                cubeFrontPanel.add(cubeletP, gbc);
            }
        }
        
        JPanel cubeBackPanel = new JPanel(new GridBagLayout());
        cubeBackPanel.setBackground(Color.darkGray);
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                final int counti = i;
                final int countj = j;
                JPanel cubeletP = new JPanel() {
                    @Override
                    protected void paintComponent(Graphics g) {
                        super.paintComponent(g);

                        // Set the color for the square
                        g.setColor(getColor(c.cubeMap.get("back").getFacePiece(countj, counti)));

                        // Calculate the size and position of the square
                        int squareSize = (int) (Math.min(getWidth(), getHeight()) / SQUARE_SIZE);
                        int x = (int) ((getWidth() - squareSize) / SQUARE_SIZE);
                        int y = (int) ((getHeight() - squareSize) / SQUARE_SIZE);

                        // Draw the square
                        g.fillRect(x, y, squareSize, squareSize);
                    }
                };
                cubeletP.setBackground(Color.darkGray);
                gbc = new GridBagConstraints();
                gbc.gridx=counti;
                gbc.gridy=countj;
                gbc.fill=GridBagConstraints.BOTH;
                gbc.weightx=1;
                gbc.weighty=1;
                cubeBackPanel.add(cubeletP, gbc);
            }
        }
        
        JPanel cubeLeftPanel = new JPanel(new GridBagLayout());
        cubeLeftPanel.setBackground(Color.darkGray);
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                final int counti = i;
                final int countj = j;
                JPanel cubeletP = new JPanel() {
                    @Override
                    protected void paintComponent(Graphics g) {
                        super.paintComponent(g);

                        // Set the color for the square
                        g.setColor(getColor(c.cubeMap.get("left").getFacePiece(countj, counti)));

                        // Calculate the size and position of the square
                        int squareSize = (int) (Math.min(getWidth(), getHeight()) / SQUARE_SIZE);
                        int x = (int) ((getWidth() - squareSize) / SQUARE_SIZE);
                        int y = (int) ((getHeight() - squareSize) / SQUARE_SIZE);

                        // Draw the square
                        g.fillRect(x, y, squareSize, squareSize);
                    }
                };
                cubeletP.setBackground(Color.darkGray);
                gbc = new GridBagConstraints();
                gbc.gridx=counti;
                gbc.gridy=countj;
                gbc.fill=GridBagConstraints.BOTH;
                gbc.weightx=1;
                gbc.weighty=1;
                cubeLeftPanel.add(cubeletP, gbc);
            }
        }
        
        JPanel cubeRightPanel = new JPanel(new GridBagLayout());
        cubeRightPanel.setBackground(Color.darkGray);
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                final int counti = i;
                final int countj = j;
                JPanel cubeletP = new JPanel() {
                    @Override
                    protected void paintComponent(Graphics g) {
                        super.paintComponent(g);

                        // Set the color for the square
                        g.setColor(getColor(c.cubeMap.get("right").getFacePiece(countj, counti)));

                        // Calculate the size and position of the square
                        int squareSize = (int) (Math.min(getWidth(), getHeight()) / SQUARE_SIZE);
                        int x = (int) ((getWidth() - squareSize) / SQUARE_SIZE);
                        int y = (int) ((getHeight() - squareSize) / SQUARE_SIZE);

                        // Draw the square
                        g.fillRect(x, y, squareSize, squareSize);
                    }
                };
                cubeletP.setBackground(Color.darkGray);
                gbc = new GridBagConstraints();
                gbc.gridx=counti;
                gbc.gridy=countj;
                gbc.fill=GridBagConstraints.BOTH;
                gbc.weightx=1;
                gbc.weighty=1;
                cubeRightPanel.add(cubeletP, gbc);
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 0 && j == 1) {
                    gbc = new GridBagConstraints();
                    gbc.gridx=j;
                    gbc.gridy=i;
                    gbc.fill=GridBagConstraints.BOTH;
                    gbc.weightx=1;
                    gbc.weighty=1;
                    gbc.insets = new Insets(5, 5, 5, 5);
                    cubePanel.add(cubeUpPanel, gbc);
                } else if (i == 1 && j == 0) {
                    gbc = new GridBagConstraints();
                    gbc.gridx=j;
                    gbc.gridy=i;
                    gbc.fill=GridBagConstraints.BOTH;
                    gbc.weightx=1;
                    gbc.weighty=1;
                    gbc.insets = new Insets(5, 5, 5, 5);
                    cubePanel.add(cubeLeftPanel, gbc);
                } else if (i == 1 && j == 1) {
                    gbc = new GridBagConstraints();
                    gbc.gridx=j;
                    gbc.gridy=i;
                    gbc.fill=GridBagConstraints.BOTH;
                    gbc.weightx=1;
                    gbc.weighty=1;
                    gbc.insets = new Insets(5, 5, 5, 5);
                    cubePanel.add(cubeFrontPanel, gbc);
                } else if (i == 1 && j == 2) {
                    gbc = new GridBagConstraints();
                    gbc.gridx=j;
                    gbc.gridy=i;
                    gbc.fill=GridBagConstraints.BOTH;
                    gbc.weightx=1;
                    gbc.weighty=1;
                    gbc.insets = new Insets(5, 5, 5, 5);
                    cubePanel.add(cubeRightPanel, gbc);
                } else if (i == 1 && j == 3) {
                    gbc = new GridBagConstraints();
                    gbc.gridx=j;
                    gbc.gridy=i;
                    gbc.fill=GridBagConstraints.BOTH;
                    gbc.weightx=1;
                    gbc.weighty=1;
                    gbc.insets = new Insets(5, 5, 5, 5);
                    cubePanel.add(cubeBackPanel, gbc);
                } else if (i == 2 && j == 1) {
                    gbc = new GridBagConstraints();
                    gbc.gridx=j;
                    gbc.gridy=i;
                    gbc.fill=GridBagConstraints.BOTH;
                    gbc.weightx=1;
                    gbc.weighty=1;
                    gbc.insets = new Insets(5, 5, 5, 5);
                    cubePanel.add(cubeDownPanel, gbc);
                }
            }
        }
        window.revalidate();
        window.repaint();
        cubePanel.revalidate();
        cubePanel.repaint();
    }
    
    static void startStopTimer(Timer timer, JLabel timerLabel) {
        if (elapsedTime == 0) {
            timer = new Timer(TIMER_DELAY, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                elapsedTime++;
                updateTimerLabel(timerLabel);
            }
            });
            timer.start();
        } else {
            timer.stop();
        }
    }
    
    static void resetTimer(JLabel timerLabel) {
        elapsedTime = 0;
        updateTimerLabel(timerLabel);
    }
    
    static void updateTimerLabel(JLabel timerLabel) {
        int centiseconds = elapsedTime;
        int seconds = elapsedTime / 100;
        int minutes = elapsedTime / 6000;

        String formattedTime = String.format("%02d:%02d:%02d", minutes, seconds, centiseconds);
        timerLabel.setText(formattedTime);
    }

    public static void main(String[] args) {
        ArrayList<HashMap<String, CubeFace>> all = allCubeOrientations();
        Random rnd = new Random();
        
        JFrame window = new JFrame("CubeScrimer");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container contentPane = window.getContentPane();
        contentPane.setBackground(Color.DARK_GRAY);
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        
        int widthWindow = (int) (screenSize.width * 0.4);
        int heightWindow = (int) (screenSize.height * 0.5);
        
        Dimension preferredSizeWindow = new Dimension(widthWindow, heightWindow);
        window.setSize(preferredSizeWindow);
        window.setLocationRelativeTo(null);
        window.setLayout(new GridBagLayout());
        
        JTextField scrambleLabel = new JTextField();
        scrambleLabel.setEditable(false);
        scrambleLabel.setOpaque(false);
        scrambleLabel.setBorder(null);
        scrambleLabel.setForeground(Color.white);
        JTextField orientationLabel = new JTextField();
        orientationLabel.setEditable(false);
        orientationLabel.setOpaque(false);
        orientationLabel.setBorder(null);
        orientationLabel.setForeground(Color.white);
        JPanel cubePanel = new JPanel(new GridBagLayout());
        cubePanel.setBackground(Color.darkGray);
        
        // Calculate the optimal font size based on screen size
        GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Rectangle bounds = graphicsEnvironment.getMaximumWindowBounds();
        int screenWidth = bounds.width;
        int screenHeight = bounds.height;
        int fontSize = Math.min(screenWidth, screenHeight) / 60;

        Font font = scrambleLabel.getFont();
        Font newFont = font.deriveFont(Font.PLAIN, fontSize);
        scrambleLabel.setFont(newFont);
        orientationLabel.setFont(newFont);
        
        redrawElements(window, new Cube(all.get(rnd.nextInt(24))), 30, cubePanel, scrambleLabel, orientationLabel);
        
        GridBagConstraints gbc;
        
        gbc = new GridBagConstraints();
        gbc.gridx=0;
        gbc.gridy=0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 5, 5, 5);
        window.add(scrambleLabel, gbc);
        
        gbc = new GridBagConstraints();
        gbc.gridx=0;
        gbc.gridy=1;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(0, 5, 0, 5);
        window.add(orientationLabel, gbc);
        
        gbc = new GridBagConstraints();
        gbc.gridx=0;
        gbc.gridy=3;
        gbc.fill=GridBagConstraints.BOTH;
        gbc.weightx=1;
        gbc.weighty=1;
        gbc.insets = new Insets(0, 5, 5, 5);
        window.add(cubePanel, gbc);
        
        JPanel buttonsP = new JPanel(new FlowLayout(FlowLayout.LEFT));
        buttonsP.setBackground(Color.darkGray);
        JButton newScrambleB = new JButton("NEW SCRAMBLE");
        buttonsP.add(newScrambleB);
        
//        JPanel timerButtonsP = new JPanel(new FlowLayout(FlowLayout.CENTER));
//        buttonsP.setBackground(Color.darkGray);
        
        Integer[] scrambleLengthArray = new Integer[]{30, 25, 20};
        JComboBox scrambleLengthCB = new JComboBox(scrambleLengthArray);
        buttonsP.add(scrambleLengthCB);
        
        newScrambleB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                redrawElements(window, new Cube(all.get(rnd.nextInt(24))), (Integer)scrambleLengthCB.getSelectedItem(), cubePanel, scrambleLabel, orientationLabel);
            }
        });
        
//        JLabel timerLabel = new JLabel("00:00:00");
//        
//        JButton startButton = new JButton("Start/Stop");
//        startButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                startStopTimer(timer, timerLabel);
//            }
//        });
        
        gbc = new GridBagConstraints();
        gbc.gridx=0;
        gbc.gridy=2;
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.weightx=1;
        gbc.insets = new Insets(5, 0, 0, 5);
        window.add(buttonsP, gbc);
        
        window.setVisible(true);
    }
}
