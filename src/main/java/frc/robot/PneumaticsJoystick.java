package frc.robot;

import frc.robot.huskylib.devices.HuskyJoystick;

public class PneumaticsJoystick extends HuskyJoystick{
  public PneumaticsJoystick(int port) {
        super(port);
    }
private static final int PNEUMATICS_JOYSTICK_PORT = 0;
 
  private static final int TRIGGER_BUTTON = 0;
  private static final int BUTTON_2 = 1;
  private static final int BUTTON_3 = 2;
  private static final int BUTTON_4 = 3;
  private static final int BUTTON_7 = 6;
  public Boolean triggerPressEvent(){
    return buttonPressEvent(TRIGGER_BUTTON);
  }
}