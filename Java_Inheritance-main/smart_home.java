package pillars.Inheritance;

class device {
   private int deviceid;
    private String status;
   device(int deviceid, String status) {
       this.deviceid = deviceid;
       this.status = status;
       
   }
   public int getDeviceId() {
       return deviceid;
   }
   public String getStatus() {
       return status;
   }
}

class thermostat extends device {
    private int temp_setting;

   thermostat(int deviceid, String status, int temp_setting) {
       super(deviceid, status);
       this.temp_setting = temp_setting;
   }

    void displaystatus() {
        System.out.println(getDeviceId());
        System.out.println(getStatus());
        System.out.println(temp_setting);
    }
}

public class smart_home {
    public static void main(String[] args) {
        thermostat a = new thermostat(101, "ON", 25);
        a.displaystatus();
        thermostat b = new thermostat(102, "OFF", 20);
        b.displaystatus();
    }
}