package services;

import models.Entity;
import models.Transform;

public class EntityService {

    public void setRotation(Entity entity, double[] rotation) {
        Transform transform = entity.getTransform();
        transform.setRotation(rotation);
        entity.setTransform(transform);
    }

    public void setTranslation(Entity entity, double[] translation) {
        Transform transform = entity.getTransform();
        transform.setTranslation(translation);
        entity.setTransform(transform);
    }
}
