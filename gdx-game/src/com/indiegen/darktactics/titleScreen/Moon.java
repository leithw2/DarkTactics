package com.indiegen.darktactics.titleScreen;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.scenes.scene2d.*;

public class Moon extends Actor
{
	Texture moon;
	float delta=0;

	Moon()
	{
		moon = new Texture(Gdx.files.internal("moon.png"));
		setX(0);
		setY(0);
	}

	@Override
	public void draw(Batch batch, float parentAlpha)
	{
		// TODO: Implement this method
		//delta += Gdx.graphics.getDeltaTime();
		batch.draw(moon,getX(),getY()+250,moon.getWidth(),moon.getHeight());

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
