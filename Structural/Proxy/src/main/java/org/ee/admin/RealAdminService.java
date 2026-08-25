package org.ee.admin;

public class RealAdminService implements AdminService
{
    @Override
    public void deleteUser(String name)
    {
        System.out.println("Deleting User Without Any Protection.....");
    }
}
