package coordinates.domain.point;

import java.util.Objects;

public class UnitCoordinate {

    private final int value;

    UnitCoordinate(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean match(final int value) {
        return this.value == value;
    }

    public UnitCoordinate calculatePositiveDifference(final UnitCoordinate unitCoordinate) {
        final int positiveDifference = Math.abs(this.value - unitCoordinate.value);

        return UnitCoordinatePool.get(positiveDifference);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final UnitCoordinate that = (UnitCoordinate) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public int square() {
        return value * value;
    }
}
