package com.indiegen.darktactics;

import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.graphics.glutils.*;
import com.badlogic.gdx.math.*;
import com.badlogic.gdx.math.collision.*;

public class KingSkeleton extends stdEnemy implements stdActor
{

	
	public void initialice()
	{
		// TODO: Implement this method
		setHP(190);
		maxHP=190;
		
		margen=32;
		setHeight(64);
		setWidth(64);

		setName("King Skeleton");

		attack = 15;

		rectangle = new Rectangle(getX(), getY(), margen, margen);	
		dir = 1;

		texture = getTexture();
		walkFrames = new TextureRegion[1];


		walkFrames[0] = new TextureRegion(getTexture(), 0,0, margen, margen);

		walk = new Animation(0.2f, walkFrames);
		walk.setPlayMode(Animation.PlayMode.NORMAL);

		waitFrames = new TextureRegion[5];

		waitFrames[0] = new TextureRegion(texture, 0,0, margen, margen);
		waitFrames[1] = new TextureRegion(texture, margen,0, margen, margen);
		waitFrames[2] = new TextureRegion(texture, margen*2,0, margen, margen);
		waitFrames[3] = new TextureRegion(texture, margen*3,0, margen, margen);
		waitFrames[4] = new TextureRegion(texture, margen*4,0, margen, margen);
		
		waitAnimation = new Animation(0.8f, waitFrames);
		waitAnimation.setPlayMode(Animation.PlayMode.NORMAL);
		

		attackFrames = new TextureRegion[1];

		attackFrames[0] = new TextureRegion(texture, 0, 0, margen, margen);

		attackAnimation = new Animation(0.2f, attackFrames);
		attackAnimation.setPlayMode(Animation.PlayMode.NORMAL);
		setTurnTexture(new TextureRegion(texture,margen,margen,margen,margen));
		
		texture = getTexture();
		rects.add(new MyRect(getX(), getY(), margen, margen));
		
	}
	
	@Override
	public void moveRects()
	{
		// TODO: Implement this method
		int margen=64;
		rects.clear();

		rects.add(new MyRect(getX(), getY() + margen, margen/2, margen));
		rects.add(new MyRect(getX(), getY() - margen/2, margen/2, margen));
		rects.add(new MyRect(getX() - margen/2, getY(), margen, margen/2));
		rects.add(new MyRect(getX() + margen, getY(), margen, margen/2));
		
	}

	@Override
	public void attackRects()
	{
		// TODO: Implement this method
		int margen=64;
		rects.clear();

		rects.add(new MyRect(getX(), getY() + margen, margen/2, margen));
		rects.add(new MyRect(getX(), getY() - margen/2, margen/2, margen));
		rects.add(new MyRect(getX() - margen/2, getY(), margen, margen/2));
		rects.add(new MyRect(getX() + margen, getY(), margen, margen/2));

	}
	
	
	@Override
	KingSkeleton(Texture texture,int x, int y, String name){
		super(texture,x,y,name);
		setTexture(texture);
		initialice();
	}
	@Override
	public void setAnimation(int animations)
	{
		// TODO: Implement this method
		delta=0;
		switch(animations){
			case 0:

				animation=waitAnimation;
				break;
			case 1:

				animation=walk;
				break;
			case 2:

				animation=attackAnimation;
				break;
		}
	}
}
