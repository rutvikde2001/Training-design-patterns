package solid.live.ocp;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 11, 2011
 * Time: 1:14:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class ResourceAllocator {
    final static private int INVALID_RESOURCE_ID = -1;

    public int allocate(ResourceHandling resource) {
        int resourceId = resource.allocate();
        return resourceId;
    }

    public void free(ResourceHandling resource, int resourceId) {
        resource.free(resourceId);
    }


}





