package solid.live.ocp;

public class TimeSlot implements ResourceHandling{
    @Override
    public int allocate() {
        int resourceId = findFreeSlot();
        markSlotBusy(resourceId);
        return resourceId;
    }

    @Override
    public void free(int resourceId) {
        markSlotFree(resourceId);
    }

    @Override
    public void markSlotFree(int resourceId) {

    }

    @Override
    public void markSlotBusy(int resourceId) {

    }

    @Override
    public int findFreeSlot() {
        return 0;
    }
}
