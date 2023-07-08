package cubescrimer;

import java.util.*;


/**
 *
 * @author Tilen
 */
public class Cube {
    HashMap<String, CubeFace> cubeMap;
    String scramble;

    public Cube(HashMap<String, CubeFace> cfmap) {
        this.cubeMap = cfmap;
    }
    
    public void rotateFace(CubeFace cf, boolean clockwise) {
        if (clockwise) {
            String temp = cf.getFacePiece(0, 0);
            cf.setFacePiece(0, 0, cf.getFacePiece(2, 0));
            cf.setFacePiece(2, 0, cf.getFacePiece(2, 2));
            cf.setFacePiece(2, 2, cf.getFacePiece(0, 2));
            cf.setFacePiece(0, 2, temp);
            temp = cf.getFacePiece(0, 1);
            cf.setFacePiece(0, 1, cf.getFacePiece(1, 0));
            cf.setFacePiece(1, 0, cf.getFacePiece(2, 1));
            cf.setFacePiece(2, 1, cf.getFacePiece(1, 2));
            cf.setFacePiece(1, 2, temp);
        } else {
            String temp = cf.getFacePiece(0, 0);
            cf.setFacePiece(0, 0, cf.getFacePiece(0, 2));
            cf.setFacePiece(0, 2, cf.getFacePiece(2, 2));
            cf.setFacePiece(2, 2, cf.getFacePiece(2, 0));
            cf.setFacePiece(2, 0, temp);
            temp = cf.getFacePiece(0, 1);
            cf.setFacePiece(0, 1, cf.getFacePiece(1, 2));
            cf.setFacePiece(1, 2, cf.getFacePiece(2, 1));
            cf.setFacePiece(2, 1, cf.getFacePiece(1, 0));
            cf.setFacePiece(1, 0, temp);
        }
    }
    
    public void upMove() {
        CubeFace up = cubeMap.get("up");
        CubeFace left = cubeMap.get("left");
        CubeFace front = cubeMap.get("front");
        CubeFace right = cubeMap.get("right");
        CubeFace back = cubeMap.get("back");
        String[] temp = new String[]{left.getFacePiece(0, 0), left.getFacePiece(0, 1), left.getFacePiece(0, 2)};
        left.setFacePiece(0, 0, front.getFacePiece(0, 0));
        left.setFacePiece(0, 1, front.getFacePiece(0, 1));
        left.setFacePiece(0, 2, front.getFacePiece(0, 2));
        front.setFacePiece(0, 0, right.getFacePiece(0, 0));
        front.setFacePiece(0, 1, right.getFacePiece(0, 1));
        front.setFacePiece(0, 2, right.getFacePiece(0, 2));
        right.setFacePiece(0, 0, back.getFacePiece(0, 0));
        right.setFacePiece(0, 1, back.getFacePiece(0, 1));
        right.setFacePiece(0, 2, back.getFacePiece(0, 2));
        back.setFacePiece(0, 0, temp[0]);
        back.setFacePiece(0, 1, temp[1]);
        back.setFacePiece(0, 2, temp[2]);
        rotateFace(up, true);
    }
    
    public void upPrimeMove() {
        CubeFace up = cubeMap.get("up");
        CubeFace left = cubeMap.get("left");
        CubeFace front = cubeMap.get("front");
        CubeFace right = cubeMap.get("right");
        CubeFace back = cubeMap.get("back");
        String[] temp = new String[]{right.getFacePiece(0, 0), right.getFacePiece(0, 1), right.getFacePiece(0, 2)};
        right.setFacePiece(0, 0, front.getFacePiece(0, 0));
        right.setFacePiece(0, 1, front.getFacePiece(0, 1));
        right.setFacePiece(0, 2, front.getFacePiece(0, 2));
        front.setFacePiece(0, 0, left.getFacePiece(0, 0));
        front.setFacePiece(0, 1, left.getFacePiece(0, 1));
        front.setFacePiece(0, 2, left.getFacePiece(0, 2));
        left.setFacePiece(0, 0, back.getFacePiece(0, 0));
        left.setFacePiece(0, 1, back.getFacePiece(0, 1));
        left.setFacePiece(0, 2, back.getFacePiece(0, 2));
        back.setFacePiece(0, 0, temp[0]);
        back.setFacePiece(0, 1, temp[1]);
        back.setFacePiece(0, 2, temp[2]);
        rotateFace(up, false);
    }
    
    public void downMove() {
        CubeFace down = cubeMap.get("down");
        CubeFace left = cubeMap.get("left");
        CubeFace front = cubeMap.get("front");
        CubeFace right = cubeMap.get("right");
        CubeFace back = cubeMap.get("back");
        String[] temp = new String[]{right.getFacePiece(2, 0), right.getFacePiece(2, 1), right.getFacePiece(2, 2)};
        right.setFacePiece(2, 0, front.getFacePiece(2, 0));
        right.setFacePiece(2, 1, front.getFacePiece(2, 1));
        right.setFacePiece(2, 2, front.getFacePiece(2, 2));
        front.setFacePiece(2, 0, left.getFacePiece(2, 0));
        front.setFacePiece(2, 1, left.getFacePiece(2, 1));
        front.setFacePiece(2, 2, left.getFacePiece(2, 2));
        left.setFacePiece(2, 0, back.getFacePiece(2, 0));
        left.setFacePiece(2, 1, back.getFacePiece(2, 1));
        left.setFacePiece(2, 2, back.getFacePiece(2, 2));
        back.setFacePiece(2, 0, temp[0]);
        back.setFacePiece(2, 1, temp[1]);
        back.setFacePiece(2, 2, temp[2]);
        rotateFace(down, true);
    }
    
    public void downPrimeMove() {
        CubeFace down = cubeMap.get("down");
        CubeFace left = cubeMap.get("left");
        CubeFace front = cubeMap.get("front");
        CubeFace right = cubeMap.get("right");
        CubeFace back = cubeMap.get("back");
        String[] temp = new String[]{left.getFacePiece(2, 0), left.getFacePiece(2, 1), left.getFacePiece(2, 2)};
        left.setFacePiece(2, 0, front.getFacePiece(2, 0));
        left.setFacePiece(2, 1, front.getFacePiece(2, 1));
        left.setFacePiece(2, 2, front.getFacePiece(2, 2));
        front.setFacePiece(2, 0, right.getFacePiece(2, 0));
        front.setFacePiece(2, 1, right.getFacePiece(2, 1));
        front.setFacePiece(2, 2, right.getFacePiece(2, 2));
        right.setFacePiece(2, 0, back.getFacePiece(2, 0));
        right.setFacePiece(2, 1, back.getFacePiece(2, 1));
        right.setFacePiece(2, 2, back.getFacePiece(2, 2));
        back.setFacePiece(2, 0, temp[0]);
        back.setFacePiece(2, 1, temp[1]);
        back.setFacePiece(2, 2, temp[2]);
        rotateFace(down, false);
    }
    
    public void frontMove() {
        CubeFace front = cubeMap.get("front");
        CubeFace left = cubeMap.get("left");
        CubeFace up = cubeMap.get("up");
        CubeFace right = cubeMap.get("right");
        CubeFace down = cubeMap.get("down");
        String[] temp = new String[]{right.getFacePiece(0, 0), right.getFacePiece(1, 0), right.getFacePiece(2, 0)};
        right.setFacePiece(0, 0, up.getFacePiece(2, 0));
        right.setFacePiece(1, 0, up.getFacePiece(2, 1));
        right.setFacePiece(2, 0, up.getFacePiece(2, 2));
        up.setFacePiece(2, 0, left.getFacePiece(2, 2));
        up.setFacePiece(2, 1, left.getFacePiece(1, 2));
        up.setFacePiece(2, 2, left.getFacePiece(0, 2));
        left.setFacePiece(2, 2, down.getFacePiece(0, 2));
        left.setFacePiece(1, 2, down.getFacePiece(0, 1));
        left.setFacePiece(0, 2, down.getFacePiece(0, 0));
        down.setFacePiece(0, 2, temp[0]);
        down.setFacePiece(0, 1, temp[1]);
        down.setFacePiece(0, 0, temp[2]);
        rotateFace(front, true);
    }
    
    public void frontPrimeMove() {
        CubeFace front = cubeMap.get("front");
        CubeFace left = cubeMap.get("left");
        CubeFace up = cubeMap.get("up");
        CubeFace right = cubeMap.get("right");
        CubeFace down = cubeMap.get("down");
        String[] temp = new String[]{left.getFacePiece(0, 2), left.getFacePiece(1, 2), left.getFacePiece(2, 2)};
        left.setFacePiece(0, 2, up.getFacePiece(2, 2));
        left.setFacePiece(1, 2, up.getFacePiece(2, 1));
        left.setFacePiece(2, 2, up.getFacePiece(2, 0));
        up.setFacePiece(2, 0, right.getFacePiece(0, 0));
        up.setFacePiece(2, 1, right.getFacePiece(1, 0));
        up.setFacePiece(2, 2, right.getFacePiece(2, 0));
        right.setFacePiece(0, 0, down.getFacePiece(0, 2));
        right.setFacePiece(1, 0, down.getFacePiece(0, 1));
        right.setFacePiece(2, 0, down.getFacePiece(0, 0));
        down.setFacePiece(0, 0, temp[0]);
        down.setFacePiece(0, 1, temp[1]);
        down.setFacePiece(0, 2, temp[2]);
        rotateFace(front, false);
    }
    
    public void backMove() {
        CubeFace back = cubeMap.get("back");
        CubeFace left = cubeMap.get("left");
        CubeFace up = cubeMap.get("up");
        CubeFace right = cubeMap.get("right");
        CubeFace down = cubeMap.get("down");
        String[] temp = new String[]{left.getFacePiece(0, 0), left.getFacePiece(1, 0), left.getFacePiece(2, 0)};
        left.setFacePiece(2, 0, up.getFacePiece(0, 0));
        left.setFacePiece(1, 0, up.getFacePiece(0, 1));
        left.setFacePiece(0, 0, up.getFacePiece(0, 2));
        up.setFacePiece(0, 0, right.getFacePiece(0, 2));
        up.setFacePiece(0, 1, right.getFacePiece(1, 2));
        up.setFacePiece(0, 2, right.getFacePiece(2, 2));
        right.setFacePiece(0, 2, down.getFacePiece(2, 2));
        right.setFacePiece(1, 2, down.getFacePiece(2, 1));
        right.setFacePiece(2, 2, down.getFacePiece(2, 0));
        down.setFacePiece(2, 0, temp[0]);
        down.setFacePiece(2, 1, temp[1]);
        down.setFacePiece(2, 2, temp[2]);
        rotateFace(back, true);
    }
    
    public void backPrimeMove() {
        CubeFace back = cubeMap.get("back");
        CubeFace left = cubeMap.get("left");
        CubeFace up = cubeMap.get("up");
        CubeFace right = cubeMap.get("right");
        CubeFace down = cubeMap.get("down");
        String[] temp = new String[]{right.getFacePiece(0, 2), right.getFacePiece(1, 2), right.getFacePiece(2, 2)};
        right.setFacePiece(0, 2, up.getFacePiece(0, 0));
        right.setFacePiece(1, 2, up.getFacePiece(0, 1));
        right.setFacePiece(2, 2, up.getFacePiece(0, 2));
        up.setFacePiece(0, 0, left.getFacePiece(2, 0));
        up.setFacePiece(0, 1, left.getFacePiece(1, 0));
        up.setFacePiece(0, 2, left.getFacePiece(0, 0));
        left.setFacePiece(2, 0, down.getFacePiece(2, 2));
        left.setFacePiece(1, 0, down.getFacePiece(2, 1));
        left.setFacePiece(0, 0, down.getFacePiece(2, 0));
        down.setFacePiece(2, 2, temp[0]);
        down.setFacePiece(2, 1, temp[1]);
        down.setFacePiece(2, 0, temp[2]);
        rotateFace(back, false);
    }
    
    public void leftMove() {
        CubeFace left = cubeMap.get("left");
        CubeFace front = cubeMap.get("front");
        CubeFace up = cubeMap.get("up");
        CubeFace back = cubeMap.get("back");
        CubeFace down = cubeMap.get("down");
        String[] temp = new String[]{down.getFacePiece(0, 0), down.getFacePiece(1, 0), down.getFacePiece(2, 0)};
        down.setFacePiece(0, 0, front.getFacePiece(0, 0));
        down.setFacePiece(1, 0, front.getFacePiece(1, 0));
        down.setFacePiece(2, 0, front.getFacePiece(2, 0));
        front.setFacePiece(0, 0, up.getFacePiece(0, 0));
        front.setFacePiece(1, 0, up.getFacePiece(1, 0));
        front.setFacePiece(2, 0, up.getFacePiece(2, 0));
        up.setFacePiece(0, 0, back.getFacePiece(2, 2));
        up.setFacePiece(1, 0, back.getFacePiece(1, 2));
        up.setFacePiece(2, 0, back.getFacePiece(0, 2));
        back.setFacePiece(2, 2, temp[0]);
        back.setFacePiece(1, 2, temp[1]);
        back.setFacePiece(0, 2, temp[2]);
        rotateFace(left, true);
    }
    
    public void leftPrimeMove() {
        CubeFace left = cubeMap.get("left");
        CubeFace front = cubeMap.get("front");
        CubeFace up = cubeMap.get("up");
        CubeFace back = cubeMap.get("back");
        CubeFace down = cubeMap.get("down");
        String[] temp = new String[]{up.getFacePiece(0, 0), up.getFacePiece(1, 0), up.getFacePiece(2, 0)};
        up.setFacePiece(0, 0, front.getFacePiece(0, 0));
        up.setFacePiece(1, 0, front.getFacePiece(1, 0));
        up.setFacePiece(2, 0, front.getFacePiece(2, 0));
        front.setFacePiece(0, 0, down.getFacePiece(0, 0));
        front.setFacePiece(1, 0, down.getFacePiece(1, 0));
        front.setFacePiece(2, 0, down.getFacePiece(2, 0));
        down.setFacePiece(0, 0, back.getFacePiece(2, 2));
        down.setFacePiece(1, 0, back.getFacePiece(1, 2));
        down.setFacePiece(2, 0, back.getFacePiece(0, 2));
        back.setFacePiece(2, 2, temp[0]);
        back.setFacePiece(1, 2, temp[1]);
        back.setFacePiece(0, 2, temp[2]);
        rotateFace(left, false);
    }
    
    public void rightMove() {
        CubeFace right = cubeMap.get("right");
        CubeFace front = cubeMap.get("front");
        CubeFace up = cubeMap.get("up");
        CubeFace back = cubeMap.get("back");
        CubeFace down = cubeMap.get("down");
        String[] temp = new String[]{up.getFacePiece(0, 2), up.getFacePiece(1, 2), up.getFacePiece(2, 2)};
        up.setFacePiece(0, 2, front.getFacePiece(0, 2));
        up.setFacePiece(1, 2, front.getFacePiece(1, 2));
        up.setFacePiece(2, 2, front.getFacePiece(2, 2));
        front.setFacePiece(0, 2, down.getFacePiece(0, 2));
        front.setFacePiece(1, 2, down.getFacePiece(1, 2));
        front.setFacePiece(2, 2, down.getFacePiece(2, 2));
        down.setFacePiece(0, 2, back.getFacePiece(2, 0));
        down.setFacePiece(1, 2, back.getFacePiece(1, 0));
        down.setFacePiece(2, 2, back.getFacePiece(0, 0));
        back.setFacePiece(2, 0, temp[0]);
        back.setFacePiece(1, 0, temp[1]);
        back.setFacePiece(0, 0, temp[2]);
        rotateFace(right, true);
    }
    
    public void rightPrimeMove() {
        CubeFace right = cubeMap.get("right");
        CubeFace front = cubeMap.get("front");
        CubeFace up = cubeMap.get("up");
        CubeFace back = cubeMap.get("back");
        CubeFace down = cubeMap.get("down");
        String[] temp = new String[]{down.getFacePiece(0, 2), down.getFacePiece(1, 2), down.getFacePiece(2, 2)};
        down.setFacePiece(0, 2, front.getFacePiece(0, 2));
        down.setFacePiece(1, 2, front.getFacePiece(1, 2));
        down.setFacePiece(2, 2, front.getFacePiece(2, 2));
        front.setFacePiece(0, 2, up.getFacePiece(0, 2));
        front.setFacePiece(1, 2, up.getFacePiece(1, 2));
        front.setFacePiece(2, 2, up.getFacePiece(2, 2));
        up.setFacePiece(0, 2, back.getFacePiece(2, 0));
        up.setFacePiece(1, 2, back.getFacePiece(1, 0));
        up.setFacePiece(2, 2, back.getFacePiece(0, 0));
        back.setFacePiece(2, 0, temp[0]);
        back.setFacePiece(1, 0, temp[1]);
        back.setFacePiece(0, 0, temp[2]);
        rotateFace(right, false);
    }

    public String getScramble() {
        return scramble;
    }

    public void setScramble(String scramble) {
        this.scramble = scramble;
    }
    
    public String getOrientation() {
        StringBuilder sb = new StringBuilder();
        for (String s : cubeMap.keySet()) {
            if (s.equals("front") || s.equals("up")) {
                sb.append(s).append(": ").append(cubeMap.get(s).faceColor);
                sb.append("    ");
            }
        }
        return sb.substring(0, sb.length()-4);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(this.scramble == null ? "" : this.scramble + "\n");
        for (String s : cubeMap.keySet()) {
            if (s.equals("front") || s.equals("up")) {
                sb.append(s).append(": ").append(cubeMap.get(s).faceColor);
                sb.append("\n");
            }
        }
        sb.append("\n");
        for (String d : cubeMap.keySet()) {
            sb.append(d).append("\n");
            sb.append(cubeMap.get(d).toString());
        }
        sb.append("\n");
        return sb.toString();
    }
}
