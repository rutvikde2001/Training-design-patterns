package solid.live.ocp;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 11, 2011
 * Time: 1:17:04 PM
 * To change this template use File | Settings | File Templates.
 */
public enum ResourceType {
    TIME_SLOT(new TimeSlot()),
    SPACE_SLOT(new SpaceSlot());

    ResourceType(TimeSlot timeSlot) {
    }

    ResourceType(SpaceSlot spaceSlot) {
    }
}
