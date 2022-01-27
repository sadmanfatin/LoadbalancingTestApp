import java.net.InetAddress;

import javax.faces.event.PhaseEvent;




public class ManagedBean {
    public ManagedBean() {
        InetAddress ip = null;
               String hostname;
               try {
                   ip = InetAddress.getLocalHost();
                   hostname = ip.getHostName();
               
                   System.out.println("Your current IP address : " + ip);
                   System.out.println("Your current Hostname : " + hostname);
               }
               catch (Exception e){
                   ;
               }
        this.setHostNamee(hostNamee);
        this.setIpAddress(ip.toString());
//        this.setHostNamee("vvvvv");
//        this.setIpAddress("ssssss");
               
    }
    private String ipAddress;
    private String hostNamee;
    
    
    public void onPageLoad(PhaseEvent phaseEvent) {
        // Add event code here...
//        InetAddress ip;
//               String hostname;
//               try {
//                   ip = InetAddress.getLocalHost();
//                   hostname = ip.getHostName();
//               
//                   System.out.println("Your current IP address : " + ip);
//                   System.out.println("Your current Hostname : " + hostname);
//               }
//               catch (Exception e){
//                   ;
//               }


    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setHostNamee(String hostNamee) {
        this.hostNamee = hostNamee;
    }

    public String getHostNamee() {
        return hostNamee;
    }
}
