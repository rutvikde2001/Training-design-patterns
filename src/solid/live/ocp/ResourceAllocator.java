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

    public int allocate(ResourceType resourceType) {
        int resourceId;
        switch (resourceType) {
            case TIME_SLOT:
                TimeSlot t = new TimeSlot();
                resourceId = t.allocate();
                break;
            case SPACE_SLOT:
                SpaceSlot s = new SpaceSlot();
                resourceId = s.allocate();
                break;
            default:
                System.out.println("ERROR: Attempted to allocate invalid resource");
                resourceId = INVALID_RESOURCE_ID;
                break;
        }
        return resourceId;
    }

    public void free(ResourceType resourceType, int resourceId) {
        switch (resourceType) {
            case TIME_SLOT:
                TimeSlot t = new TimeSlot();
                t.free(resourceId);
                break;
            case SPACE_SLOT:
                SpaceSlot s = new SpaceSlot();
                s.free(resourceId);
                break;

            default:
                System.out.println("ERROR: attempted to free invalid resource");
                break;
        }
    }


}





