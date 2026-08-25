package org.ee;

import org.ee.admin.AdminService;
import org.ee.admin.AdminServiceProxy;
import org.ee.admin.RealAdminService;
import org.ee.video.Video;
import org.ee.video.VideoProcessing;
import org.ee.video.VideoProcessorProxy;

public class Main
{
    public static void main(String[] args)
    {

        // client doesn't know the control we do in the background
        DocumentUtils documentUtils =
          new ReadingDocumentProxy("SecretFile.txt");

        documentUtils.readDocument();
        System.out.println("************************************");
        VideoProcessing processor = new VideoProcessorProxy();
        processor.process(new Video("Video 1" , (long) 20.330));
        System.out.println("************************************");
        // these 2 lines shouldnt be done in the client side , it is done in startup or something
        AdminService realAdminService = new RealAdminService();
        AdminService proxyAdminService = new AdminServiceProxy(realAdminService);
        // this what client should do (if we don't inject Implementation in the Proxy itself)
        proxyAdminService.deleteUser("Ahmed");

    }
}