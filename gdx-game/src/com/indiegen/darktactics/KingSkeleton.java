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
		
		margen=64;
		setHeight(128);
		setWidth(128);

		setName("king");

		attack = 15;

		rectangle = new Rectangle(getX(), getY(), margen, margen);	
		dir = 1;

		texture = getTexture();
		walkFrames = new TextureRegion[1];


		walkFrames[0] = new TextureRegion(texture, 0,0, margen, margen);

		walk = new Animation(0.2f, walkFrames);
		walk.setPlayMode(Animation.PlayMode.NORMAL);

		waitFrames = new TextureRegion[1];

		waitFrames[0] = new TextureRegion(texture, 0,0, margen, margen);

		waitAnimation = new Animation(0.8f, waitFrames);
		waitAnimation.setPlayMode(Animation.PlayMode.NORMAL);
		

		attackFrames = new TextureRegion[1];

		attackFrames[0] = new TextureRegion(texture, 0, 0, margen, margen);

		attackAnimation = new Animation(0.2f, attackFrames);
		attackAnimation.setPlayMode(Animation.PlayMode.NORMAL);
		setTurnTexture(new TextureRegion(texture,64,64,16,16));
		
		texture = getTexture();
		rects.add(new MyRect(getX(), getY(), margen, margen));
		
	}
	
	@Override
	public void moveRects()
	{
		// TODO: Implement this method
		int margen=128;
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
		int margen=128;
		rects.clear();

		rects.add(new MyRect(getX(), getY() + margen, margen/2, margen));
		rects.add(new MyRect(getX(), getY() - margen/2, margen/2, margen));
		rects.add(new MyRect(getX() - margen/2, getY(), margen, margen/2));
		rects.add(new MyRect(getX() + margen, getY(), margen, margen/2));

	}
	
	
	@Override
	KingSkeleton(Texture settexture,int x, int y, String name){
		super(settexture,x,y,name);
		
	}
	
}
