package com.jlg.sand;

import com.jlg.sand.dto.Gate;

import java.util.*;

public class GATES {

    // documentation https://en.wikipedia.org/wiki/Logic_gate#:~:text=Likewise%2C%20an%20OR%20function%20is,AND%20gate%20with%20negated%20inputs.



    public static void main(String[] args) {
        System.out.println("start of gates");
        List testGatesr1 = new ArrayList();

        List col1 = List.of (
            new Gate("empty",0,0,"unset",0,0, "unset", 0,0, "true"),
            new Gate("empty",0,0,"unset", 0,0,"unset", 0,0, "false"),
            new Gate("empty",0,0,"unset",0,0,"unset", 0,0, "false"),
            new Gate("empty",0,0,"unset", 0,0,"unset", 0,0, "false")
        );
        List<Gate> col2 = List.of (
            new Gate("AND",1,1,"unset",2,1, "unset", 0,0, "unset"),
            new Gate("empty",0,0,"unset", 0,0,"unset", 0,0, "unset"),
            new Gate("OR",3,1,"unset",4,1,"unset", 0,0, "unset"),
            new Gate("empty",0,0,"unset", 0,0,"unset", 0,0, "unset")
        );

        System.out.println("before");
        System.out.println("gates col1=" + printGate(col1));
        System.out.println("gates col2=" + printGate(col2));
    }

    private static String printGate (List<Gate> gates){
        String returnString = "";
        for (Gate gate: gates) {
            returnString = returnString + " "
                + "in1[" + gate.getInputOneRow() + "," + gate.getInputOneCol() + "=" + gate.getInputOneValue() + "]" +  gate.getGateType()
            + "->" + gate.getOutputValue() + ",    ";
        }
        return returnString;
    }

}
