package org.ee.admin;

public class AdminServiceProxy implements AdminService
{
    private final AdminService delegate;

    public AdminServiceProxy(AdminService delegate)
    {
        this.delegate = delegate;
        // we can also do something like thins
//        this.delegate = new RealAdminService();
    }

    @Override
    public void deleteUser(String name)
    {
        System.out.println("Running some Authorization checks for before deleting...");
        delegate.deleteUser(name);
    }
}
