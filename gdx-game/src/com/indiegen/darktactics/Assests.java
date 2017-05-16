package com.indiegen.darktactics;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.audio.*;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import android.text.style.*;

public class Assests
{
	
	public Texture texture = new Texture(Gdx.files.internal("floor.png"));
    public Texture gatsu = new Texture(Gdx.files.internal("gatsu.png"));
	//public Texture hero = new Texture(Gdx.files.internal("hero.jpg"));
	public Texture hero2 = new Texture(Gdx.files.internal("hero2.png"));
	public Texture hero21 = new Texture(Gdx.files.internal("hero21.png"));
	public Texture tiles = new Texture(Gdx.files.internal("tiles.png"));
	public Texture enemy = new Texture(Gdx.files.internal("skull.png"));
	public Texture button1 = new Texture(Gdx.files.internal("sword.png"));
	public Texture walkbutton = new Texture(Gdx.files.internal("walkbutton2.png"));
	public Texture Background = new Texture(Gdx.files.internal("Background.png"));
	public Music music = Gdx.audio.newMusic(Gdx.files.internal("Enemy Attack.mp3"));
	public Sound swordAttackSound = Gdx.audio.newSound(Gdx.files.internal("SwordAttack.mp3"));
	public Sound walkSound = Gdx.audio.newSound(Gdx.files.internal("walk.wav"));
	public Texture hmi = new Texture(Gdx.files.internal("hmi.png"));
	public Texture light = new Texture(Gdx.files.internal("Picture3.png"));
	public Skin skin = new Skin(Gdx.files.internal("uiskin.json"));
	public Texture torch = new Texture(Gdx.files.internal("torch.png"));
	public Texture heroCloseUp = new Texture(Gdx.files.internal("heroCloseUp2.png"));
	public Texture guard = new Texture(Gdx.files.internal("guard.png"));
	public Texture item = new Texture(Gdx.files.internal("item.png"));

}


