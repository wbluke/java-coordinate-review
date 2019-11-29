package coordinates.domain.point;

public class RelativeCoordinate extends UnitCoordinate {

    private RelativeCoordinate(final int value) {
        super(value);
    }

    public static RelativeCoordinate from(final int value) {
        return new RelativeCoordinate(value);
    }
}
