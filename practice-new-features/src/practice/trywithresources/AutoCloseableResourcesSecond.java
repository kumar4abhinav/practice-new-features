package practice.trywithresources;

public class AutoCloseableResourcesSecond implements AutoCloseable {

    public AutoCloseableResourcesSecond() {
        System.out.println("Constructor -&gt; AutoCloseableResources_Second");
    }

    public void doSomething() {
        System.out.println("Something -&gt; AutoCloseableResources_Second");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closed AutoCloseableResources_Second");
        throw new Exception("Exception in close() for AutoCloseableResourcesSecond");
    }
}