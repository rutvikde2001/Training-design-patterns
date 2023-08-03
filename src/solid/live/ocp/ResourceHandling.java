package solid.live.ocp;

interface ResourceHandling{

    int allocate();

    void free(int resourceId);

    void markSlotFree(int resourceId);

    void markSlotBusy(int resourceId);

    int findFreeSlot();

}