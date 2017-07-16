package com.indiegen.darktactics.titleScreen;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.scenes.scene2d.*;

public class Clouds extends Actor
{
	Texture clouds;
	float delta=0;

	Clouds()
	{
		clouds = new Texture(Gdx.files.internal("clouds.png"));
		setX(0);
		setY(0);
	}

	@Override
	public void draw(Batch batch, float parentAlpha)
	{
		// TODO: Implement this method
		//delta += Gdx.graphics.getDeltaTime();
		batch.draw(clouds,getX(),getY()+250,clouds.getWidth(),clouds.getHeight());

		super.draw(batch, parentAlpha);
	}

	@Override
	public void act(float delta)
	{
		// TODO: Implement this method
		this.delta=delta;
		super.act(delta);
	}

}
