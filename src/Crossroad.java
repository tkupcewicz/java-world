import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by Tymek on 30.12.2015.
 */
public class Crossroad extends Building {

    public Crossroad(float posX, float posY) {
        this.setPosition(posX,posY);
        img = MapConfig.getCrossroadImg();
    }

    public Crossroad() {
    }

    @Override
    void drawImage(Graphics g) {
       if(MapConfig.isCrossroadVisible()){
           g.drawImage(
                   MapConfig.getCrossroadImg(),
                   (int) this.getPosition().getX() - MapConfig.getCrossroadImg().getWidth()/2,
                   (int) this.getPosition().getY() - MapConfig.getCrossroadImg().getHeight()/2,
                   WorldController.getWorldController());
       }
    }

    @Override
    BufferedImage getImage() {
        return MapConfig.getCrossroadImg();
    }

}
