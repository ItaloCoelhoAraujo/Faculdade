package br.estacio.italo;

import br.estacio.newton.robot.RobotTest;

public class ProgramaRobot {
    public static void main(String[] args){
        RobotTest programa = new RobotTest(new Robot());

        programa.mainMenu();
    }
}
