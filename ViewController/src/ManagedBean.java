import java.net.InetAddress;

import javax.faces.event.PhaseEvent;




public class ManagedBean {
    public ManagedBean() {
        InetAddress ip = null;
               String hostname = null;
               String severName =  null;
               try {
                   ip = InetAddress.getLocalHost();
                   hostname = ip.getHostName();
                   severName =  System.getProperty("weblogic.Name");
//                   System.out.println("Your current IP address : " + ip);
//                   System.out.println("Your current Hostname : " + hostname);
//                   System.out.println(" server name "+ System.getProperty("weblogic.Name"));
               }
               catch (Exception e){
                   ;
               }
        this.setHostNamee(hostNamee);
        this.setIpAddress(ip.toString());
        this.setServerName(severName);
//        this.setHostNamee("vvvvv");
//        this.setIpAddress("ssssss");
               
    }
    private String ipAddress;
    private String hostNamee;
    
    private String serverName;
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

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getServerName() {
        return serverName;
    }
}
