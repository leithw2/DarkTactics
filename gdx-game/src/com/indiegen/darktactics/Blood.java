package com.indiegen.darktactics;
import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.graphics.glutils.*;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.*;
import com.badlogic.gdx.scenes.scene2d.*;
import java.util.*;

public class Blood extends Actor
{
	ShapeRenderer shape;
	MyActor actor;
	ArrayList<Particle> bloods;
	
	Blood(ShapeRenderer shape){
		this.shape=shape;
		int delta;
		bloods = new ArrayList<Particle>();
		
		
	}
	
	@Override
    public void draw(Batch batch, float parentAlpha)
	{
		
		batch.end();	
		Gdx.gl.glEnable(GL20.GL_BLEND);
		//Gdx.gl.glBlendFunc(GL20.GL_SRC_ALPHA, GL20.GL_ONE_MINUS_SRC_ALPHA);
		shape.begin(ShapeType.Filled);	
		//shape.setProjectionMatrix(shape.getProjectionMatrix());
		
		for (Particle blood: bloods){
			shape.setColor(blood.getColor());
			shape.rect(blood.getPos().x,blood.getPos().y,blood.getSize(),blood.getSize());
			blood.animate(.008f);
			
			
			
		}
		
		Iterator<Particle> itr = bloods.listIterator();
		
		while(itr.hasNext()){
			if (itr.next().getAlpha()<= 0){
				bloods.remove(itr);
			}
		}

		shape.end();
		Gdx.gl.glDisable(GL20.GL_BLEND);

		batch.begin();
		
	}
	public void createBlood(MyActor actor)
	{
		bloods.add(new Particle(actor));
		bloods.add(new Particle(actor));
		bloods.add(new Particle(actor));
		bloods.add(new Particle(actor));
		bloods.add(new Particle(actor));
		bloods.add(new Particle(actor));
		bloods.add(new Particle(actor));
		bloods.add(new Particle(actor));
		bloods.add(new Particle(actor));
		bloods.add(new Particle(actor));
		bloods.add(new Particle(actor));
		bloods.add(new Particle(actor));
		
		
	}
	
	
}
