package tc.oc.pgm.filters.query;

import org.bukkit.entity.Entity;

public interface IEntityTypeQuery extends IMatchQuery {

    Class<? extends Entity> getEntityType();

    @Override
    default int randomSeed() {
        return getEntityType().hashCode();
    }
}
