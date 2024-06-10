package com.poly.polyapcsafinalproject23_24;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.poly.polyapcsafinalproject23_24.GameActivity;

import java.nio.file.Path;
import java.util.Random;
import java.util.Scanner;

public class GameFlowersMaya extends GameActivity {

    private TextView tvTitle, tvSubtitle, tvStoryText;
    private ImageView ivStory;
    private Button btn1, btn2, btn3, btn4, btn5;

    private boolean isWon;

    private int numLives;

    @Override
    protected void run() {
        setContentView(R.layout.activity_game_5_button);

        tvTitle = findViewById(R.id.tv_title_txt);
        tvSubtitle = findViewById(R.id.tv_subtitle);
        tvStoryText = findViewById(R.id.tv_story);
        ivStory = findViewById(R.id.iv_story);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);
        btn5 = findViewById(R.id.btn_5);


        tvTitle.setText("Hiking Adventure!");
        tvStoryText.setText("It’s hiking day and you are lost in the middle of the woods. What will you do?  You have 4 lives, Good Luck ");


        numLives = 4;
        start();
    }


    private void setAllBtnsVisible() {
        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);
        btn4.setVisibility(View.VISIBLE);
        btn5.setVisibility(View.VISIBLE);
    }

    private void setBtnsConinue() {
        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);
        btn5.setVisibility(View.INVISIBLE);
        btn1.setText("Coninue");
    }


    private void start() {
        isWon = false;

        ivStory.setImageResource(R.drawable.im_laborday_title);
        playAudio(R.raw.audio_laborday_bass);
        //start adventure here

        String text = "Number of lives:\t" + numLives + "You are lost. What will you do?";


        tvStoryText.setText(text);

        setAllBtnsVisible();
        btn1.setText("Pull out your phone");
        btn2.setText("Keep adventuring hoping to find a way out");
        btn2.setText("Camp For The Night");
        btn4.setVisibility(View.INVISIBLE);
        btn5.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PullOutPhone();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KeepAdventuring();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CampForTheNight();
            }
        });


    }

    private void PullOutPhone() {

        ivStory.setImageResource(R.drawable.im_laborday_beach);

        tvStoryText.setText("\"You pulled out your phone and realize you can only");

        setAllBtnsVisible();
        btn1.setText(" Call 911");
        btn2.setText("Play video games");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);
        btn5.setVisibility(View.INVISIBLE);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Call911();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlayVideoGames();
            }
        });
    }

    private void Call911() {


        double chance = Math.random();


        if (chance < 0.5) {
            isWon = false;
            tvStoryText.setText("They thought this call was fake and hung up on you.");
            ivStory.setImageResource(R.drawable.im_laborday_free_meal);
            setAllBtnsVisible();
            btn1.setText("Next");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn5.setVisibility(View.INVISIBLE);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    defeat();
                }
            });
        } else {
            setAllBtnsVisible();
            btn1.setText("Next");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn5.setVisibility(View.INVISIBLE);


            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    RescueMission();

                }
            });

        }
    }


    private void RescueMission() {

        tvStoryText.setText("They got your call and sent out a rescue mission");


        double chance = Math.random();
        if (chance < 0.5) {
            isWon = false;
            tvStoryText.setText("They could not find you and stopped saving you. You were trapped in the woods. You Died");
            setAllBtnsVisible();
            btn1.setText("Next");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn5.setVisibility(View.INVISIBLE);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    defeat();
                }
            });
        } else {
            setAllBtnsVisible();
            btn1.setText("Next");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn5.setVisibility(View.INVISIBLE);


            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    FoundCivilization();

                }
            });


        }
    }

    private void PlayVideoGames() {


        double chance = Math.random();
        if (chance > .5) {

            isWon = false;
            tvStoryText.setText("You can’t play any games, you have no cellular data on your phone. You died by natural causes.");
            setAllBtnsVisible();
            btn1.setText("Next");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn5.setVisibility(View.INVISIBLE);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    defeat();
                }
            });

        } else if (chance < .9) {
            isWon = false;
            tvStoryText.setText("You play video games but then realize you don't know how to play any games on your phone. You died by natural causes.");
            setAllBtnsVisible();
            btn1.setText("Next");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn5.setVisibility(View.INVISIBLE);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    defeat();
                }
            });
        } else if (chance > .5) {
            isWon = false;

            tvStoryText.setText("You stay playing games for too long and got eaten by a bear. You died");
            setAllBtnsVisible();
            btn1.setText("Next");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn5.setVisibility(View.INVISIBLE);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    defeat();
                }
            });
        } else {
            setAllBtnsVisible();
            btn1.setText("Next");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn5.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    PlayRPG();
                }
            });

        }

    }

    private void PlayRPG() {

        tvStoryText.setText("You decided to play a rpg game and it taught you how to make it out of the woods. ");

        double chance = Math.random();
        if (chance < 0.5) {
            setAllBtnsVisible();
            btn1.setText("Next");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn5.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    FoundCivilization();

                }
            });
        } else {
            isWon = false;
            tvStoryText.setText("It did not help, it made you get even more lost and you got bitten to death by wild bats. You died");
            setAllBtnsVisible();
            btn1.setText("Next");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn5.setVisibility(View.INVISIBLE);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    defeat();
                }
            });


        }
    }

    private void KeepAdventuring() {

        tvStoryText.setText("You kept adventuring and came across; a old house, a dark cave, and a path that leads to somewhere. What will you pick?");

        setAllBtnsVisible();
        btn1.setText(" A old house");
        btn2.setText("A dark cave");
        btn3.setText("A path that leads to somewhere");
        btn4.setVisibility(View.INVISIBLE);
        btn5.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AOldHouse();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ADarkCave();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                APathThatLeadsToSomewhere();
            }
        });
    }


    private void AOldHouse() {

        tvStoryText.setText("You went inside the old house.");
        tvStoryText.setText("It was very dark inside, and you could not see anything. You deciced to take out your flash light out of your bag. You saw a huge table with a huge feast filled with chicken and ribs. You decided to...");


        setAllBtnsVisible();
        btn1.setText(" Eat everything off the table");
        btn2.setText("Take only a bite");
        btn3.setText("Leave the food alone");
        btn4.setVisibility(View.INVISIBLE);
        btn5.setVisibility(View.INVISIBLE);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eatEverything();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                takeABite();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leaveTheFoodAlone();
            }
        });
    }

    private void eatEverything() {


        double chance = Math.random();
        if (chance > .7) {


            isWon = true;
            tvStoryText.setText("You ate everyting and felt really happy. You started to make the old house your home");
            setAllBtnsVisible();
            btn1.setText("Next");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    YouWon();
                }
            });
        } else {

            isWon = false;
            tvStoryText.setText("You ate everthing and you started to have a irritating stomach ache. It hurted so much to where you passed out. You died.");
            setAllBtnsVisible();
            btn1.setText("Next");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn5.setVisibility(View.INVISIBLE);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    defeat();
                }
            });
        }
    }

    private void takeABite() {

        double chance = Math.random();

        if (chance > .9) {
            isWon = true;
            tvStoryText.setText("You ate one bite and felt really happy. You started to make the old house your home");
            setAllBtnsVisible();
            btn1.setText("Next");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn5.setVisibility(View.INVISIBLE);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    YouWon();
                }
            });
        }


        if (chance > .5) {
            tvStoryText.setText("You took one bite and felt nothing. You didnt know what else to do ever since you took that one bite. It seems nothing in your life matters anymore, you couldn't do anything else and you didnt feel happy anymore. There was nothing to entertain you... 2 months later. No one came for you and you felt really unhappy, lonely, and empty. You died by a rope.");
            setAllBtnsVisible();
            btn1.setText("Next");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn5.setVisibility(View.INVISIBLE);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    defeat();
                }
            });
        } else {
            tvStoryText.setText("You took one bite and threw up. You died from a sickness");
            setAllBtnsVisible();
            btn1.setText("Next");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn5.setVisibility(View.INVISIBLE);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    defeat();
                }
            });
        }
    }

    private void leaveTheFoodAlone() {

        double chance = Math.random();

        if (chance > .5) {
            isWon = true;
            tvStoryText.setText("You ate nothing and felt really happy. You started to make the old house your home");

            setAllBtnsVisible();
            btn1.setText("Next");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn5.setVisibility(View.INVISIBLE);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    YouWon();
                }
            });

        }

        if (chance > .7) {
            isWon = false;
            tvStoryText.setText("You ate nothing and felt nothing. You didnt know what else to do ever since you didnt eat anything. It seems nothing in your life matters anymore, you couldn't do anything else and you didnt feel happy anymore. There was nothing to entertain you... 2 months later, No one came for you and you felt really unhappy, lonely, and empty. You died unhappy.");
            setAllBtnsVisible();
            btn1.setText("Next");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn5.setVisibility(View.INVISIBLE);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    defeat();

                }
            });
        } else {
            isWon = false;
            tvStoryText.setText("You ate nothing and the food started to rot leaving the house sinking. After a hour the smell was getting really toxic to where you started choking. You died from choking to death.");
            setAllBtnsVisible();
            btn1.setText("Next");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn5.setVisibility(View.INVISIBLE);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    defeat();

                }
            });
        }
    }


    private void ADarkCave() {

        tvStoryText.setText("It was very dark inside, and you could not see anything. You deciced to take out your flash light out of your bag; you then saw two tunnels. One of tunnels lead to hungry wild animals and the other was a old mines shaft. What will you chose?");
        tvStoryText.setText("1. The tunnel with the hungry wild animals\n2. The mines shaft");
        setAllBtnsVisible();
        btn1.setText("The tunnel with the hungry wild animals");
        btn2.setText("The mines shaft");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);
        btn5.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HungryWildAnimals();
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mining();
            }
        });


    }

    private void HungryWildAnimals() {

        tvStoryText.setText("You went inside the tunnel with the hungry wild animals");


        double chance = Math.random();

        if (chance > .9) {
            isWon = false;
            tvStoryText.setText("You got eaten");
            setAllBtnsVisible();
            btn1.setText("Next");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn5.setVisibility(View.INVISIBLE);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    defeat();

                }
            });
        }
        if (chance > .7) {
            isWon = false;
            tvStoryText.setText("The hungry animals did not eat you. Instead they just stared at you. I mean you have been stuck in the wood for over 3 years. You havent been showering or eating healthy, you've just been waiting and waiting for someone to come look for you. The hungry animals walked away while you just stand there quietly depressed. You Died tragically");
            setAllBtnsVisible();
            btn1.setText("Next");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn5.setVisibility(View.INVISIBLE);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    defeat();

                }
            });
        }

        if (chance > .5) {
            tvStoryText.setText("The Hungry animals left you alone in the empty tunnel, but you felt really hungry so you could either...");

            btn1.setText("Kill the hungry animals");
            btn2.setText("Or leave the hungry animals alone.");
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn5.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    killTheAnimals();
                }
            });
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    leaveTheAnimalsAlone();
                }
            });
        }
    }

    private void killTheAnimals() {
        double chance = Math.random();


        if (chance > .7) {
            isWon = false;
            tvStoryText.setText("You tried to kill the animals but they attacked you. You died. ");
            setAllBtnsVisible();
            btn1.setText("Next");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn5.setVisibility(View.INVISIBLE);


            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    defeat();
                }
            });
        }

        if (chance > .5) {
            tvStoryText.setText("You attempt to you kill the animals, but you only manage to kill one which was the Hyena. The rest of the animals didnt do anything. Do you want to kill the rest of the animals?");
            setAllBtnsVisible();
            btn1.setText("Yes");
            btn2.setText("No");
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn5.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    yes();
                }
            });
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    no();
                }
            });
        }
    }

    private void yes() {
        double chance = Math.random();

        if (chance > .9) {

            tvStoryText.setText("The rest of the animals killed you");
            setAllBtnsVisible();
            btn1.setText("Next");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn5.setVisibility(View.INVISIBLE);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    defeat();

                }
            });
        }
        if (chance > .5) {
            tvStoryText.setText("You manage to kill the rest of the animals. And it seem like there was a opening outside the tunnel ");
            tvStoryText.setText("You Choose to...");
            setAllBtnsVisible();
            btn1.setText("Stay in the cave");
            btn2.setText("Or walk outside");
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn5.setVisibility(View.INVISIBLE);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    stayInTheCave();
                }
            });
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Outside();
                }
            });
        }
    }

    private void stayInTheCave() {


        tvStoryText.setText("You stay inside the very dark cave. While inside two killer bats came inside the cave and started to bite you very hard. You died from killer bats");
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);
        btn5.setVisibility(View.INVISIBLE);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defeat();

            }
        });
    }

    private void Outside() {


        System.out.println("You walked toward the ouside. Outside the tunnel was a small little city");
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);
        btn5.setVisibility(View.INVISIBLE);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FoundCivilization();

            }
        });
    }

    private void no() {

        double chance = Math.random();
        if (chance < 0.5) {
            tvStoryText.setText("You left the rest of the animals alone, but you got really bored. The animals didn't care about you, no one did. You start to realize what the hell are you even doing with youself. A week past by and You got really. You wanted killed the animals for some food but you didn't. Instead you took one of your knifes and cut your leg off, you then ate it. You start to do the same for the rest of your body parts. You then passed and died");
            setAllBtnsVisible();
            btn1.setText("Next");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn5.setVisibility(View.INVISIBLE);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    defeat();
                }
            });


        } else {
            tvStoryText.setText("The animals decided to eat you. You died");
            setAllBtnsVisible();
            btn1.setText("Next");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn5.setVisibility(View.INVISIBLE);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    defeat();

                }
            });

        }
    }


    private void leaveTheAnimalsAlone() {
        double chance = Math.random();
        if (chance < 0.5) {
            tvStoryText.setText("You left the the animals alone, but you got really bored. The animals didn't care about you, no one did. You start to realize what the hell are you even doing with youself. A week past by and You got really. You wanted killed the animals for some food but you didn't. Instead you took one of your knifes and cut your leg off, you then ate it. You start to do the same for the rest of your body parts. You then passed and died");
            setAllBtnsVisible();
            btn1.setText("Next");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn5.setVisibility(View.INVISIBLE);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    defeat();
                }
            });


        } else {
            tvStoryText.setText("You left the animals alone. The animals decided to eat you. You died");
            setAllBtnsVisible();
            btn1.setText("Next");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn5.setVisibility(View.INVISIBLE);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    defeat();

                }
            });

        }


    }


    private void Mining() {

        tvStoryText.setText("You went inside the mining shaft");
        tvStoryText.setText("Inside was pretty empty, there was only a few mine carts that were filled with items. You went to go see what's inside each cart.");
        tvStoryText.setText("One had stone and iron, other one had gold bricks, and the last one had copper");
        tvStoryText.setText("Which one will you choose?");
        setAllBtnsVisible();
        btn1.setText("The cart with the stone and iron");
        btn2.setText("The cart with the gold bricks");
        btn3.setText("The cart with copper");
        btn4.setVisibility(View.INVISIBLE);
        btn5.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StoneIron();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goldBricks();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                copperBricks();
            }
        });
    }


        private void StoneIron() {


            tvStoryText.setText("You pick the cart with the stone and iron. You didn't know what to do with it. Everything else was pretty boring. You didnt die but you pretty bored and lonely. You have a choice you can exit the mines and go to the other tunnel with the hungry animals or you can stay here and rot.");
            setAllBtnsVisible();
            btn1.setText("Go to the tunnel with the hungry animals");
            btn2.setText("Or stay here");
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn5.setVisibility(View.INVISIBLE);


            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tunnelHungryWildAnimals();
                }
            });
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Stay();
                }
            });

        }
        private void tunnelHungryWildAnimals() {
            System.out.println("You exit the mines and went into the tunnel with the hungry animals");
            setAllBtnsVisible();
            btn1.setText("Next");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn5.setVisibility(View.INVISIBLE);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    HungryWildAnimals();
                }
            });


        }
            private void Stay() {


                tvStoryText.setText("You choosed to stay in the mines. After a week living in the mines shaft, you got really skinny to where you could see your actual bones. You didnt have any food so you just starved. You died from stavation");
                    setAllBtnsVisible();
                    btn1.setText("Next");
                    btn2.setVisibility(View.INVISIBLE);
                    btn3.setVisibility(View.INVISIBLE);
                    btn4.setVisibility(View.INVISIBLE);
                    btn5.setVisibility(View.INVISIBLE);
                    btn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            defeat();
                        }
                    });

                }




        private void goldBricks() {


                tvStoryText.setText("You pick the cart with the gold bricks. You felt rich but you didn't know what to do with the gold bricks. You put 4 gold bricks in your bag. Everything else was pretty boring. You didnt die but you pretty bored and lonely. You have a choice you can exit the mines and go to the other tunnel with the hungry animals or you can stay here and rot.");
            setAllBtnsVisible();
            btn1.setText("Go to the tunnel with the hungry animals");
            btn2.setText("Or stay here");
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn5.setVisibility(View.INVISIBLE);


            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tunnelHungryWildAnimals();
                }
            });
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Stay();
                }
            });
            }

        private void copperBricks()
        {


            tvStoryText.setText("You pick the cart with the copper. You didn't know what to do with it. Everything else was pretty boring. You didnt die but you pretty bored and lonely. You have a choice you can exit the mines and go to the other tunnel with the hungry animals or you can stay here and rot.");
            setAllBtnsVisible();
            btn1.setText("Go to the tunnel with the hungry animals");
            btn2.setText("Or stay here");
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn5.setVisibility(View.INVISIBLE);


            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tunnelHungryWildAnimals();
                }
            });
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Stay();
                }
            });
        }



    private void APathThatLeadsToSomewhere() {

        tvStoryText.setText("You followed the path");
        tvStoryText.setText("The path lead up to two different paths. One leading left and the one leading right");
        tvStoryText.setText("Which one will you pick");


        setAllBtnsVisible();
        btn1.setText("The left path");
        btn2.setText("The right path");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);
        btn5.setVisibility(View.INVISIBLE);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LeftPath();
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RightPath();
            }
        });
    }
    private void LeftPath()
    {

        tvStoryText.setText("The left path lead to a cliff. Down the cliff you saw a small little city. You decide to try and get down off the cliff.");
            double chance = Math.random();

            if (chance > .5)
            {

                tvStoryText.setText("You did not make it off the cliff sucessfully. You fell down, tripped and filped over a bunch of times. You landed on top of a pointy rock and died.");
                setAllBtnsVisible();
                btn1.setText("Next");
                btn2.setVisibility(View.INVISIBLE);
                btn3.setVisibility(View.INVISIBLE);
                btn4.setVisibility(View.INVISIBLE);
                btn5.setVisibility(View.INVISIBLE);

                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        defeat();
                    }
                });
            }

            if (chance > .7)
            {

                System.out.print("You sucessfully made it down the cliff and walked towards the city");
                setAllBtnsVisible();
                btn1.setText("Next");
                btn2.setVisibility(View.INVISIBLE);
                btn3.setVisibility(View.INVISIBLE);
                btn4.setVisibility(View.INVISIBLE);
                btn5.setVisibility(View.INVISIBLE);

                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        continuedWithAdventure();
                    }
                });
            }
        }

        private void RightPath()
        {

            tvStoryText.setText("The right path lead to a different old house");
            setAllBtnsVisible();
            btn1.setText("Next");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn5.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AOldHouse();
                }
            });
    }


    private void CampForTheNight() {

        tvStoryText.setText("You decided to camp for the night.");
        tvStoryText.setText("You found three places to set up camp");
        tvStoryText.setText("One place had a lot of trees and rocks. Another place was by a river. The last was a open field, barely any trees or rocks");
        tvStoryText.setText("You decided...");


        setAllBtnsVisible();
        btn1.setText("The place with a lot of trees and rocks");
        btn2.setText("The place by a river");
        btn2.setText("The open field");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TreesAndRocks();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                River();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenField();
            }
        });
    }
private void TreesAndRocks() {

    tvStoryText.setText("You decided to camp at the place with a lot of trees and rocks.");
    tvStoryText.setText("You couldn't find a spot to put your tent, so you just tried to make a campfire ");

        double chance = Math.random();

        if (chance > .9) {
            System.out.println("You wasn't able to build a campfire. Your clothes caught on fire and the fire started to spead through out the whole forest. The fire was starting to burn you and the smoke was hard to breathe in. You died from burning to death");

            setAllBtnsVisible();
            btn1.setText("Next");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn5.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    defeat();
                }
            });
        }
        if (chance > .5) {
            System.out.println("You built the campfire, but you didnt know what else to do. You couldnt build a tent since there was no room and you had no tools so you couldnt chop any of the trees down. After a while the fire started to become bigger. You tried putting the fire out but you couldn't. Your clothes started to catch on fire and the fire started to spead through out the whole forest. The fire was starting to burn you and the smoke was hard to breathe in. You died from burning to death");
            setAllBtnsVisible();
            btn1.setText("Next");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn5.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    defeat();
                }
            });
        }
    }

private void River() {


    tvStoryText.setText("You decided to camp the place by a river");
    tvStoryText.setText("You set up your tent, and made a campfire, and since there was a river you could fish for food. You were feeling really happy. Couple of days later you started to want to just stay here for the rest you life living in the wood. There was everything that you needed and you felt at home. Overtime you eventually started to make a wooden house for yourself to live off of. This was the best decision you ever made :).");
    setAllBtnsVisible();
    btn1.setText("Next");
    btn2.setVisibility(View.INVISIBLE);
    btn3.setVisibility(View.INVISIBLE);
    btn4.setVisibility(View.INVISIBLE);
    btn5.setVisibility(View.INVISIBLE);

    btn1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            YouWon();
        }
    });


}

private void OpenField() {


    tvStoryText.setText("You decided to set up camp in the open field.");
    tvStoryText.setText("You setted up your tent, but you really couldn't do anything else. There was no wood to make a campfire and there wasnt any food. A couple of hours had gone by you felt really hungry. You then saw a bald eagle flying around. You decided to...");

    setAllBtnsVisible();
    btn1.setText("Try to kill the bald eagle");
    btn2.setText("leave the eagle alone");
    btn3.setVisibility(View.INVISIBLE);
    btn4.setVisibility(View.INVISIBLE);
    btn5.setVisibility(View.INVISIBLE);

    btn1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            KillEagle();
        }
    });

    btn1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            LeaveEagleAlone();
        }
    });
}
private void KillEagle()
{

    double chance = Math.random();

    if (chance > .9) {
        tvStoryText.setText("You tried to kill the bald eagle, but the eagle faught back and kept biting you really hard. You died from a bald eagle.");
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);
        btn5.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defeat();
            }
        });

    }

    if (chance > .5) {
        tvStoryText.setText("You managed to kill the bald eagle and you ate it. Ten minutes later you started to feel really sick. You threw up and passed out. You then died. You died of food poisoning.");
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);
        btn5.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defeat();
            }
        });

    }

    if (chance > .7) {
        tvStoryText.setText("You missed and you then collapsed on to the ground. You died from starvation.");
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);
        btn5.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defeat();
            }
        });


    }
}
private void LeaveEagleAlone(){

    tvStoryText.setText("You left the bald eagle alone. Ten minutes later, you then collapsed on to the ground. You died from starvation.");
    setAllBtnsVisible();
    btn1.setText("Next");
    btn2.setVisibility(View.INVISIBLE);
    btn3.setVisibility(View.INVISIBLE);
    btn4.setVisibility(View.INVISIBLE);
    btn5.setVisibility(View.INVISIBLE);

    btn1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            defeat();
        }
    });
}




    private void FoundCivilization() {
        tvStoryText.setText("You made it out of the woods and found a city. will you continue on with your adventure?");

        setAllBtnsVisible();
        btn1.setText("Yes");
        btn2.setText("No");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);
        btn5.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Yes();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                No();
            }
        });
    }

private void Yes() {

    tvStoryText.setText("You continue on with your adventure");
    setAllBtnsVisible();
    btn1.setText("Next");
    btn2.setVisibility(View.INVISIBLE);
    btn3.setVisibility(View.INVISIBLE);
    btn4.setVisibility(View.INVISIBLE);
    btn5.setVisibility(View.INVISIBLE);

    btn1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            continuedWithAdventure();
        }
    });
    }

private void No()
{

    tvStoryText.setText("You did not want to go out to the city. You stayed in the woods but didnt know what else to do. You died of boredem");
    setAllBtnsVisible();
    btn1.setText("Next");
    btn2.setVisibility(View.INVISIBLE);
    btn3.setVisibility(View.INVISIBLE);
    btn4.setVisibility(View.INVISIBLE);
    btn5.setVisibility(View.INVISIBLE);

    btn1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            defeat();
        }
    });
        }


    private void continuedWithAdventure() {
        tvStoryText.setText("You went inside the local city, and you manage to find a few people to talk to:");
        tvStoryText.setText("Addie, Williams, and Jay ");

        tvStoryText.setText("\nAddie is a very strong person, she loves wrestling, friendly, and very weathly. You do not want to get on her bad side");

        tvStoryText.setText("\nWilliams is shy person, he is a nerd, and get very envious of other people");

        tvStoryText.setText("\nJay is a great person but then very mean when once you get to know him");

        tvStoryText.setText("\nWho do you want to talk to");
        System.out.println("1. Addie\n2. Williams\n3. Jay");

        setAllBtnsVisible();
        btn1.setText("Addie");
        btn1.setText("Williams");
        btn1.setText("Jay");
        btn4.setVisibility(View.INVISIBLE);
        btn5.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AddieTwo();
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WilliamsTwo();
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                JayTwo();
            }
        });

    }
    private void AddieTwo()
    {
        tvStoryText.setText("You walked towards Addie and said: hello");
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);
        btn5.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Addie();
            }
        });


        }
        private void WilliamsTwo() {

                System.out.println("You walked towards Williams and said: hello");
            setAllBtnsVisible();
            btn1.setText("Next");
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn5.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Williams();
                }
            });

            }
            private void JayTwo() {

            System.out.println("You walked toward Jay and said: hello");
                setAllBtnsVisible();
                btn1.setText("Next");
                btn2.setVisibility(View.INVISIBLE);
                btn3.setVisibility(View.INVISIBLE);
                btn4.setVisibility(View.INVISIBLE);
                btn5.setVisibility(View.INVISIBLE);

                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Jay();
                    }
                });
        }


    private void Addie()
    {

        tvStoryText.setText("Addie: Hey, so I heard that you got stuck in the middle of the woods? ");
        tvStoryText.setText("1. Yes\n2. No");
        btn1.setText("Yes");
        btn1.setText("No");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);
        btn5.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Nice();
            }
        });

    btn1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Bad();
        }
    });
}


        private void Nice() {

            tvStoryText.setText("+1 Heart");
            tvStoryText.setText("Addie: You did? Wow, how was it like? Were you scared?");

            btn1.setText("It was okay, I wasn't really scared");
            btn2.setText("It was really nerve-racking, I felt very alone");
            btn3.setText("Say Nothing");
            btn4.setVisibility(View.INVISIBLE);
            btn5.setVisibility(View.INVISIBLE);

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Addie2();
                    ;
                }
            });
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Addie3();
                    ;
                }
            });
            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Addie4();
                    ;
                }
            });
        }
        private void Addie4(){

            tvStoryText.setText("...I see that you don’t want to talk. I’ll just leave you be. Bye..");
            tvStoryText.setText("...You can only talk to Williams and Jay now.");
            tvStoryText.setText("Who do you want to talk to?");
                    System.out.println("1. Williams\n2. Jay");
            setAllBtnsVisible();
            btn1.setText("Williams");
            btn2.setText("Jay");
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            btn5.setVisibility(View.INVISIBLE);


            if (Choice == 1) {
                        System.out.println("You walked towards Williams and said: hello");
                        Util.pauseConsole();
                        Williams();
                    }

                    if (Choice == 2) {
                        System.out.println("You walked toward Jay and said: hello");
                        Util.pauseConsole();
                        Jay();
                    }


                }






        private void Bad()
        {
            System.out.println("Addie: No? But I thought heard someone say that- you know what nevermind if your not gonna tell that’s fine. I can talk to someone else. Bye!");
            Util.pauseConsole();
            Util.clearConsole();
            System.out.println("...You can only talk to Willams and Jay now.");
            System.out.println("Who do you want to talk to?");
            System.out.println("1. Williams\n2. Jay");
            int Choice = Util.enterInt(1, 2);

            if (Choice == 1)
            {
                System.out.println("You walked towards Williams and said: hello");
                Util.pauseConsole();
                Williams();
            }

            if (Choice == 2)
            {
                System.out.println("You walked toward Jay and said: hello");
                Util.pauseConsole();
                Jay();
            }
        }




    private void Addie2()
    {
        Util.clearConsole();
        System.out.println("-1 Heart");
        System.out.println("Really? That’s it? Okay well I see that you don’t want to talk about it. How about we go grab food together?");
        System.out.println("1. Yes\n2. No");
        int choice = Util.enterInt(1, 2);

        if (choice == 1)
        {
            System.out.println("You both went to a food stand");
            System.out.println("Addie: So how did you make it out of the woods");
            System.out.println("1. No comment\n2. I called 911\n3. I played an RPG game and it helped me\n4. I went through a cave of hungry animals and it lend me here\n5. climbed down the edge of a cliff");
            int option = Util.enterInt(1,5);

            if (option == 1)
            {
                System.out.println("Addie: Hey why aren't you talking to me? …Fine ill just go.");
                Util.pauseConsole();
                Util.clearConsole();
                System.out.println("...You can only talk to Willams and Jay now.");
                System.out.println("Who do you want to talk to?");
                System.out.println("1. Williams\n2. Jay");
                int Choice = Util.enterInt(1, 2);

                if (Choice == 1)
                {
                    System.out.println("You walked towards Willams and said: hello");
                    Util.pauseConsole();
                    Williams();
                }

                if (Choice == 2)
                {
                    System.out.println("You walked toward Jay and said: hello");
                    Util.pauseConsole();
                    Jay();

                }
            }

            if (option == 2)
            {
                Util.clearConsole();
                System.out.println("Addie: Wow that so cool. I’m glad that you made it out.");
                System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Addie that you didn't have anywhere to stay.");
                System.out.println("Addie: I’m sorry but I really can’t do anything about that. I have a couple of people staying over and it would just cause a huge mess. I’m sorry, but I saw a hotel nearby maybe you can stay there. Bye..");
                System.out.println("You went to the hotel and stayed the night.");
                Util.pauseConsole();
                YouMadeIt();
            }

            if (option == 3)
            {
                Util.clearConsole();
                System.out.println("Addie: Wow that so cool. I’m glad that you made it out.");
                System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Addie that you didn't have anywhere to stay.");
                System.out.println("Addie: I’m sorry but I really can’t do anything about that. I have a couple of people staying over and it would just cause a huge mess. I’m sorry, but I saw a hotel nearby maybe you can stay there. Bye..");
                System.out.println("You went to the hotel and stayed the night.");
                Util.pauseConsole();
                YouMadeIt();
            }

            if (option == 4)
            {
                Util.clearConsole();
                System.out.println("Addie: Wow that so cool. I’m glad that you made it out.");
                System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Addie that you didn't have anywhere to stay.");
                System.out.println("Addie: I’m sorry but I really can’t do anything about that. I have a couple of people staying over and it would just cause a huge mess. I’m sorry, but I saw a hotel nearby maybe you can stay there. Bye..");
                System.out.println("You went to the hotel and stayed the night.");
                Util.pauseConsole();
                YouMadeIt();
            }

            if (option == 5)
            {
                Util.clearConsole();
                System.out.println("Addie: Wow that so cool. I’m glad that you made it out.");
                System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Addie that you didn't have anywhere to stay.");
                System.out.println("Addie: I’m sorry but I really can’t do anything about that. I have a couple of people staying over and it would just cause a huge mess. I’m sorry, but I saw a hotel nearby maybe you can stay there. Bye..");
                System.out.println("You went to the hotel and stayed the night.");
                Util.pauseConsole();
                YouMadeIt();
            }



        }

        if (choice == 2)
        {
            System.out.println("Addie: No? Oh okay i'll just go somewhere else.");
            Util.pauseConsole();
            Util.clearConsole();
            System.out.println("...You can only talk to Willams and Jay now.");
            System.out.println("Who do you want to talk to?");
            System.out.println("1. Williams\n2. Jay");
            int Choice = Util.enterInt(1, 2);

            if (Choice == 1)
            {
                System.out.println("You walked towards Williams and said: hello");
                Util.pauseConsole();
                Williams();
            }

            if (Choice == 2)
            {
                System.out.println("You walked toward Jay and said: hello");
                Util.pauseConsole();
                Jay();

            }
        }
    }

    private void Addie3()
    {
        Util.clearConsole();
        System.out.println("+1 Heart");
        System.out.println("Addie:It was? Oh I’m sorry. If I was there I would've try and rescue you… So you want to go grab food together?");
        System.out.println("1. Yes\n2. No");
        int choice = Util.enterInt(1, 2);

        if (choice == 1)
        {
            System.out.println("You both went to a cafe");
            System.out.println("So how did you make it out of the woods");
            System.out.println("1. No comment\n2. I called 911\n3. I played an RPG game and it helped me\n4. I went through a cave of hungry animals and it lend me here\n5. climbed down the edge of a cliff");
            int option = Util.enterInt(1,5);

            if (option == 1)
            {
                System.out.println("Addie: Hey why aren't you talking to me? …Fine ill just go.");
                Util.pauseConsole();
                Util.clearConsole();
                System.out.println("...You can only talk to Willams and Jay now.");
                System.out.println("Who do you want to talk to?");
                System.out.println("1. Williams\n2. Jay");
                int Choice = Util.enterInt(1, 2);

                if (Choice == 1)
                {
                    System.out.println("You walked towards Willams and said: hello");
                    Util.pauseConsole();
                    Williams();
                }

                if (Choice == 2)
                {
                    System.out.println("You walked toward Jay and said: hello");
                    Util.pauseConsole();
                    Jay();

                }
            }

            if (option == 2)
            {
                Util.clearConsole();
                System.out.println("Addie: Wow that so cool. I’m glad that you made it out so we could hang.");
                System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Addie that you didn't have anywhere to stay.");
                System.out.println("Addie Addie offers to let you stay the night.");
                Util.pauseConsole();
                YouMadeIt();
            }

            if (option == 3)
            {
                Util.clearConsole();
                System.out.println("Addie: Wow that so cool. I’m glad that you made it out so we could hang.");
                System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Addie that you didn't have anywhere to stay.");
                System.out.println("Addie Addie offers to let you stay the night.");
                Util.pauseConsole();
                YouMadeIt();
            }

            if (option == 4)
            {
                Util.clearConsole();
                System.out.println("Addie: Wow that so cool. I’m glad that you made it out so we could hang.");
                System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Addie that you didn't have anywhere to stay.");
                System.out.println("Addie Addie offers to let you stay the night.");
                Util.pauseConsole();
                YouMadeIt();
            }

            if (option == 5)
            {
                Util.clearConsole();
                System.out.println("Addie: Wow that so cool. I’m glad that you made it out so we could hang.");
                System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Addie that you didn't have anywhere to stay.");
                System.out.println("Addie Addie offers to let you stay the night.");
                Util.pauseConsole();
                YouMadeIt();
            }
        }
        if (choice == 2)
        {
            System.out.println("-1 Heart");
            System.out.println("Oh well then do you want to go to a park?");
            System.out.println("1. No\n2. Yes");
            int Choice = Util.enterInt(1, 2);

            if (Choice == 1)
            {
                Util.clearConsole();
                System.out.println("Addie: So how did you make it out of the woods");
                System.out.println("1. No comment\n2. I called 911\n3. I played an RPG game and it helped me\n4. I went through a cave of hungry animals and it lend me here\n5. climbed down the edge of a cliff");
                int option = Util.enterInt(1,5);

                if (option == 2)
                {
                    Util.clearConsole();
                    System.out.println("Addie: Wow that so cool. I’m glad that you made it out.");
                    System.out.println("You told Addie that you didn't have anywhere to stay.");
                    System.out.println("Addie: I’m sorry but I really can’t do anything about that. I have a couple of people staying over and it would just cause a huge mess. I’m sorry, but I saw a hotel nearby maybe you can stay there. Bye..");
                    System.out.println("You went to the hotel and stayed the night.");
                    Util.pauseConsole();
                    YouMadeIt();
                }

                if (option == 3)
                {
                    Util.clearConsole();
                    System.out.println("Addie: Wow that so cool. I’m glad that you made it out.");
                    System.out.println("You told Addie that you didn't have anywhere to stay.");
                    System.out.println("Addie: I’m sorry but I really can’t do anything about that. I have a couple of people staying over and it would just cause a huge mess. I’m sorry, but I saw a hotel nearby maybe you can stay there. Bye..");
                    System.out.println("You went to the hotel and stayed the night.");
                    Util.pauseConsole();
                    YouMadeIt();
                }

                if (option == 4)
                {
                    Util.clearConsole();
                    System.out.println("Addie: Wow that so cool. I’m glad that you made it out.");
                    System.out.println("You told Addie that you didn't have anywhere to stay.");
                    System.out.println("Addie: I’m sorry but I really can’t do anything about that. I have a couple of people staying over and it would just cause a huge mess. I’m sorry, but I saw a hotel nearby maybe you can stay there. Bye..");
                    System.out.println("You went to the hotel and stayed the night.");
                    Util.pauseConsole();
                    YouMadeIt();
                }

                if (option == 5)
                {
                    Util.clearConsole();
                    System.out.println("Addie: Wow that so cool. I’m glad that you made it out.");
                    System.out.println("You told Addie that you didn't have anywhere to stay.");
                    System.out.println("Addie: I’m sorry but I really can’t do anything about that. I have a couple of people staying over and it would just cause a huge mess. I’m sorry, but I saw a hotel nearby maybe you can stay there. Bye..");
                    System.out.println("You went to the hotel and stayed the night.");
                    Util.pauseConsole();
                    YouMadeIt();
                }

            }

            if (Choice == 2)
            {
                System.out.println("Oh…fine whatever ill just go.");
                Util.pauseConsole();
                Util.clearConsole();
                System.out.println("...You can only talk to Williams and Jay now.");
                System.out.println("Who do you want to talk to?");
                System.out.println("1. Williams\n2. Jay");
                int Choose = Util.enterInt(1, 2);

                if (Choose == 1)
                {
                    System.out.println("You walked towards Williams and said: hello");
                    Util.pauseConsole();
                    Williams();
                }

                if (Choose == 2)
                {
                    System.out.println("You walked toward Jay and said: hello");
                    Util.pauseConsole();
                    Jay();

                }

            }
        }
    }

    private void Williams()
    {
        Util.clearConsole();
        Util.clearConsole();
        System.out.println("Williams: Hi, so um I got told that you got stuck in the middle of the woods");
        System.out.println("1. Yes\n2. No");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            System.out.println("+1 Heart");
            System.out.println("William: Interesting.. so how was it? Did you get scared?");
            System.out.println("1. It was okay, I wasn't really scared\n2. It was really nerve-racking, I felt very alone\n3. No comment");
            int option = Util.enterInt(1, 3);

            if (option == 1)
            {
                Util.pauseConsole();
                Williams2();
            }

            if (option == 2)
            {
                Util.pauseConsole();
                Williams3();
            }

            if (option == 3)
            {
                Util.pauseConsole();
                System.out.println("...You dont walk to talk? Oh okay I can just go this way..");
                Util.pauseConsole();
                Util.clearConsole();
                System.out.println("...You can only talk to Addie and Jay now.");
                System.out.println("Who do you want to talk to?");
                System.out.println("1. Addie\n2. Jay");
                int Choice = Util.enterInt(1, 2);

                if (Choice == 1)
                {
                    System.out.println("You walked towards Addie and said: hello");
                    Util.pauseConsole();
                    Addie();
                }

                if (Choice == 2)
                {
                    System.out.println("You walked toward Jay and said: hello");
                    Util.pauseConsole();
                    Jay();
                }


            }


        }

        if (choice == 2)
        {
            System.out.println("Williams: Oh... I'm sorry, I'll just leave you be");
            Util.pauseConsole();
            Util.clearConsole();
            System.out.println("...You can only talk to Addie and Jay now.");
            System.out.println("Who do you want to talk to?");
            System.out.println("1. Addie\n2. Jay");
            int Choice = Util.enterInt(1, 2);

            if (Choice == 1)
            {
                System.out.println("You walked towards Addie and said: hello");
                Util.pauseConsole();
                Addie();
            }

            if (Choice == 2)
            {
                System.out.println("You walked toward Jay and said: hello");
                Util.pauseConsole();
                Jay();
            }
        }


    }

    private void Williams2()
    {
        Util.clearConsole();
        System.out.println("-1 Heart");
        System.out.println("Williams: Oh That was it? Okay um... Hey how about we go grab food together?");
        System.out.println("1. Yes\n2. No");
        int choice = Util.enterInt(1, 2);

        if (choice == 1)
        {
            System.out.println("You both went to a food stand");
            System.out.println("Williams: So how did you make it out of the woods");
            System.out.println("1. No comment\n2. I called 911\n3. I played an RPG game and it helped me\n4. I went through a cave of hungry animals and it lend me here\n5. climbed down the edge of a cliff");
            int option = Util.enterInt(1,5);

            if (option == 1)
            {
                System.out.println("Williams: ...I guess I understand why you're not talking. Maybe I should go.");
                Util.pauseConsole();
                Util.clearConsole();
                System.out.println("...You can only talk to Addie and Jay now.");
                System.out.println("Who do you want to talk to?");
                System.out.println("1. Addie\n2. Jay");
                int Choice = Util.enterInt(1, 2);

                if (Choice == 1)
                {
                    System.out.println("You walked towards Addie and said: hello");
                    Util.pauseConsole();
                    Addie();
                }

                if (Choice == 2)
                {
                    System.out.println("You walked toward Jay and said: hello");
                    Util.pauseConsole();
                    Jay();

                }
            }

            if (option == 2)
            {
                Util.clearConsole();
                System.out.println("Williams: Nice! That really cool.");
                System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Williams that you didn't have anywhere to stay.");
                System.out.println("Williams: I’m sorry but I really can’t do anything about that. I can't have people staying over right now, but I did saw a hotel nearby maybe you can stay there. Bye..");
                System.out.println("You went to the hotel and stayed the night.");
                Util.pauseConsole();
                YouMadeIt();
            }

            if (option == 3)
            {
                Util.clearConsole();
                System.out.println("Williams: Nice! That really cool.");
                System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Addie that you didn't have anywhere to stay.");
                System.out.println("Williams: I’m sorry but I really can’t do anything about that. I can't have people staying over right now, but I did saw a hotel nearby maybe you can stay there. Bye..");
                System.out.println("You went to the hotel and stayed the night.");
                Util.pauseConsole();
                YouMadeIt();
            }

            if (option == 4)
            {
                Util.clearConsole();
                System.out.println("Williams: Nice! That really cool.");
                System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Williams that you didn't have anywhere to stay.");
                System.out.println("Williams: I’m sorry but I really can’t do anything about that. I can't have people staying over right now, but I did saw a hotel nearby maybe you can stay there. Bye..");
                System.out.println("You went to the hotel and stayed the night.");
                Util.pauseConsole();
                YouMadeIt();
            }

            if (option == 5)
            {
                Util.clearConsole();
                System.out.println("Williams: Nice! That really cool.");
                System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Williams that you didn't have anywhere to stay.");
                System.out.println("Williams: I’m sorry but I really can’t do anything about that. I can't have people staying over right now, but I did saw a hotel nearby maybe you can stay there. Bye..");
                System.out.println("You went to the hotel and stayed the night.");
                Util.pauseConsole();
                YouMadeIt();
            }



        }

        if (choice == 2)
        {
            System.out.println("Oh okay I should just leave you be. I'll just go somewhere else.");
            Util.pauseConsole();
            Util.clearConsole();
            System.out.println("...You can only talk to Addie and Jay now.");
            System.out.println("Who do you want to talk to?");
            System.out.println("1. Addie\n2. Jay");
            int Choice = Util.enterInt(1, 2);

            if (Choice == 1)
            {
                System.out.println("You walked towards Addie and said: hello");
                Util.pauseConsole();
                Addie();
            }

            if (Choice == 2)
            {
                System.out.println("You walked toward Jay and said: hello");
                Util.pauseConsole();
                Jay();

            }
        }
    }

    private void Williams3()
    {
        Util.clearConsole();
        System.out.println("+1 Heart");
        System.out.println("It was? Oh I’m sorry that you got stuck. If I was there I would've helped you... Hey do you want to go grab something to eat?");
        System.out.println("1. Yes\n2. No");
        int choice = Util.enterInt(1, 2);

        if (choice == 1)
        {
            System.out.println("You both went to a cafe");
            System.out.println("Williams: So how did you make it out of the woods");
            System.out.println("1. No comment\n2. I called 911\n3. I played an RPG game and it helped me\n4. I went through a cave of hungry animals and it lend me here\n5. climbed down the edge of a cliff");
            int option = Util.enterInt(1,5);

            if (option == 1)
            {
                System.out.println("Williams: ...I guess I understand why you're not talking. Maybe I should go.");
                Util.pauseConsole();
                Util.clearConsole();
                System.out.println("...You can only talk to Addie and Jay now.");
                System.out.println("Who do you want to talk to?");
                System.out.println("1. Addie\n2. Jay");
                int Choice = Util.enterInt(1, 2);

                if (Choice == 1)
                {
                    System.out.println("You walked towards Addie and said: hello");
                    Util.pauseConsole();
                    Addie();
                }

                if (Choice == 2)
                {
                    System.out.println("You walked toward Jay and said: hello");
                    Util.pauseConsole();
                    Jay();

                }
            }

            if (option == 2)
            {
                Util.clearConsole();
                System.out.println("Williams: Nice...Hey I’m glad that you made it out so we could hang.");
                System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Williams that you didn't have anywhere to stay.");
                System.out.println("Williams offers to let you stay the night.");
                Util.pauseConsole();
                YouMadeIt();
            }

            if (option == 3)
            {
                Util.clearConsole();
                System.out.println("Willams: Nice...Hey I’m glad that you made it out so we could hang.");
                System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Williams that you didn't have anywhere to stay.");
                System.out.println("Willams offers to let you stay the night.");
                Util.pauseConsole();
                YouMadeIt();
            }

            if (option == 4)
            {
                Util.clearConsole();
                System.out.println("Williams: Nice...Hey I’m glad that you made it out so we could hang.");
                System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Williams that you didn't have anywhere to stay.");
                System.out.println("Williams offers to let you stay the night.");
                Util.pauseConsole();
                YouMadeIt();
            }

            if (option == 5)
            {
                Util.clearConsole();
                System.out.println("Williams: Nice...Hey I’m glad that you made it out so we could hang.");
                System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Williams that you didn't have anywhere to stay.");
                System.out.println("Williams offers to let you stay the night.");
                Util.pauseConsole();
                YouMadeIt();
            }
        }
        if (choice == 2)
        {
            System.out.println("-1 Heart");
            System.out.println("Williams: Oh well then do you want to go to a park?");
            System.out.println("1. No\n2. Yes");
            int Choice = Util.enterInt(1, 2);

            if (Choice == 1)
            {
                Util.clearConsole();
                System.out.println("Williams: So how did you make it out of the woods");
                System.out.println("1. No comment\n2. I called 911\n3. I played an RPG game and it helped me\n4. I went through a cave of hungry animals and it lend me here\n5. climbed down the edge of a cliff");
                int option = Util.enterInt(1,5);

                if (option == 2)
                {
                    Util.clearConsole();
                    System.out.println("Williams: Nice! That really cool.");
                    System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Williams that you didn't have anywhere to stay.");
                    System.out.println("Williams: I’m sorry but I really can’t do anything about that. I can't have people staying over right now, but I did saw a hotel nearby maybe you can stay there. Bye..");
                    System.out.println("You went to the hotel and stayed the night.");
                    Util.pauseConsole();
                    YouMadeIt();
                }

                if (option == 3)
                {
                    Util.clearConsole();
                    System.out.println("Williams: Nice! That really cool.");
                    System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Williams that you didn't have anywhere to stay.");
                    System.out.println("Williams: I’m sorry but I really can’t do anything about that. I can't have people staying over right now, but I did saw a hotel nearby maybe you can stay there. Bye..");
                    System.out.println("You went to the hotel and stayed the night.");
                    Util.pauseConsole();
                    YouMadeIt();
                }

                if (option == 4)
                {
                    Util.clearConsole();
                    System.out.println("Williams: Nice! That really cool.");
                    System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Williams that you didn't have anywhere to stay.");
                    System.out.println("Williams: I’m sorry but I really can’t do anything about that. I can't have people staying over right now, but I did saw a hotel nearby maybe you can stay there. Bye..");
                    System.out.println("You went to the hotel and stayed the night.");
                    Util.pauseConsole();
                    YouMadeIt();
                }

                if (option == 5)
                {
                    Util.clearConsole();
                    System.out.println("Williams: Nice! That really cool.");
                    System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Williams that you didn't have anywhere to stay.");
                    System.out.println("Williams: I’m sorry but I really can’t do anything about that. I can't have people staying over right now, but I did saw a hotel nearby maybe you can stay there. Bye..");
                    System.out.println("You went to the hotel and stayed the night.");
                    Util.pauseConsole();
                    YouMadeIt();
                }

            }

            if (Choice == 2)
            {
                System.out.println("Williams: Oh okay I should just leave you be. I'll just go somewhere else.");
                Util.pauseConsole();
                Util.clearConsole();
                System.out.println("...You can only talk to Addie and Jay now.");
                System.out.println("Who do you want to talk to?");
                System.out.println("1. Addie\n2. Jay");
                int choose = Util.enterInt(1, 2);

                if (choose == 1)
                {
                    System.out.println("You walked towards Addie and said: hello");
                    Util.pauseConsole();
                    Addie();
                }

                if (choose == 2)
                {
                    System.out.println("You walked toward Jay and said: hello");
                    Util.pauseConsole();
                    Jay();

                }

            }
        }
    }



    private void Jay()
    {
        Util.clearConsole();Util.clearConsole();
        Util.clearConsole();
        System.out.println("Jay: So I over heard that told that you got stuck in the middle of the woods");
        System.out.println("1. Yes\n2. No");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            System.out.println("+1 Heart");
            System.out.println("Jay: Cool.. so how was it? Did someone get scared?");
            System.out.println("1. It was okay, I wasn't really scared\n2. It was really nerve-racking, I felt very alone\n3. No comment");
            int option = Util.enterInt(1, 3);

            if (option == 1)
            {
                Util.pauseConsole();
                Jay2();
            }

            if (option == 2)
            {
                Util.pauseConsole();
                Jay3();
            }

            if (option == 3)
            {
                Util.pauseConsole();
                System.out.println("Jay: ...What you do want to talk? Alright if you wont talk then I wont talk..");
                Util.pauseConsole();
                Util.clearConsole();
                System.out.println("...You can only talk to Addie and Williams now.");
                System.out.println("Who do you want to talk to?");
                System.out.println("1. Addie\n2. Williams");
                int Choice = Util.enterInt(1, 2);

                if (Choice == 1)
                {
                    System.out.println("You walked towards Addie and said: hello");
                    Util.pauseConsole();
                    Addie();
                }

                if (Choice == 2)
                {
                    System.out.println("You walked toward Williams and said: hello");
                    Util.pauseConsole();
                    Williams();
                }


            }


        }

        if (choice == 2)
        {
            System.out.println("Jay: You sure? Cause then I'll just go. Bye dude!");
            Util.pauseConsole();
            Util.clearConsole();
            System.out.println("...You can only talk to Addie and Williams now.");
            System.out.println("Who do you want to talk to?");
            System.out.println("1. Addie\n2. Williams");
            int Choice = Util.enterInt(1, 2);

            if (Choice == 1)
            {
                System.out.println("You walked towards Addie and said: hello");
                Util.pauseConsole();
                Addie();
            }

            if (Choice == 2)
            {
                System.out.println("You walked toward Williams and said: hello");
                Util.pauseConsole();
                Williams();
            }
        }


    }

    private void Jay2()
    {
        Util.clearConsole();
        System.out.println("-1 Heart");
        System.out.println("Jay: Wow That's it? Okay... Hey why dont we how go grab food together?");
        System.out.println("1. Yes\n2. No");
        int choice = Util.enterInt(1, 2);

        if (choice == 1)
        {
            System.out.println("You both went to a food stand");
            System.out.println("Jay: So how did you make it out of the woods");
            System.out.println("1. No comment\n2. I called 911\n3. I played an RPG game and it helped me\n4. I went through a cave of hungry animals and it lend me here\n5. climbed down the edge of a cliff");
            int option = Util.enterInt(1,5);

            if (option == 1)
            {
                System.out.println("Jay: Hey you can't just stop talking. I mean fine I'll just go.");
                Util.pauseConsole();
                Util.clearConsole();
                System.out.println("...You can only talk to Addie and Williams now.");
                System.out.println("Who do you want to talk to?");
                System.out.println("1. Addie\n2. Williams");
                int Choice = Util.enterInt(1, 2);

                if (Choice == 1)
                {
                    System.out.println("You walked towards Addie and said: hello");
                    Util.pauseConsole();
                    Addie();
                }

                if (Choice == 2)
                {
                    System.out.println("You walked toward Williams and said: hello");
                    Util.pauseConsole();
                    Williams();

                }
            }

            if (option == 2)
            {
                Util.clearConsole();
                System.out.println("Jay: That sick, I mean I would probably do something more cool.");
                System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Williams that you didn't have anywhere to stay.");
                System.out.println("Jay: Sorry but I really can’t do anything about that. You see I don't like when people stay over, but I think saw a hotel nearby maybe you can stay there. Bye..");
                System.out.println("You went to the hotel and stayed the night.");
                Util.pauseConsole();
                YouMadeIt();
            }

            if (option == 3)
            {
                Util.clearConsole();
                System.out.println("Jay: That sick, I mean I would probably do something more cool.");
                System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Williams that you didn't have anywhere to stay.");
                System.out.println("Jay: Sorry but I really can’t do anything about that. You see I don't like when people stay over, but I think saw a hotel nearby maybe you can stay there. Bye..");
                System.out.println("You went to the hotel and stayed the night.");
                Util.pauseConsole();
                YouMadeIt();
            }

            if (option == 4)
            {
                Util.clearConsole();
                System.out.println("Jay: That sick, I mean I would probably do something more cool.");
                System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Williams that you didn't have anywhere to stay.");
                System.out.println("Jay: Sorry but I really can’t do anything about that. You see I don't like when people stay over, but I think saw a hotel nearby maybe you can stay there. Bye..");
                System.out.println("You went to the hotel and stayed the night.");
                Util.pauseConsole();
                YouMadeIt();
            }

            if (option == 5)
            {
                Util.clearConsole();
                System.out.println("Jay: That sick, I mean I would probably do something more cool.");
                System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Williams that you didn't have anywhere to stay.");
                System.out.println("Jay: Sorry but I really can’t do anything about that. You see I don't like when people stay over, but I think saw a hotel nearby maybe you can stay there. Bye..");
                System.out.println("You went to the hotel and stayed the night.");
                Util.pauseConsole();
                YouMadeIt();
            }



        }

        if (choice == 2)
        {
            System.out.println("Nothing? Alright bye.");
            Util.pauseConsole();
            Util.clearConsole();
            System.out.println("...You can only talk to Addie and Williams now.");
            System.out.println("Who do you want to talk to?");
            System.out.println("1. Addie\n2. Williams");
            int Choice = Util.enterInt(1, 2);

            if (Choice == 1)
            {
                System.out.println("You walked towards Addie and said: hello");
                Util.pauseConsole();
                Addie();
            }

            if (Choice == 2)
            {
                System.out.println("You walked toward Jay and said: hello");
                Util.pauseConsole();
                Williams();

            }
        }
    }

    private void Jay3()
    {
        Util.clearConsole();
        System.out.println("+1 Heart");
        System.out.println("Wasn't it now? Well I guess sorry if you were feeling that way... Hey do you want to go grab something to eat?");
        System.out.println("1. Yes\n2. No");
        int choice = Util.enterInt(1, 2);

        if (choice == 1)
        {
            System.out.println("You both went to a cafe");
            System.out.println("Jay: So how did you make it out of the woods");
            System.out.println("1. No comment\n2. I called 911\n3. I played an RPG game and it helped me\n4. I went through a cave of hungry animals and it lend me here\n5. climbed down the edge of a cliff");
            int option = Util.enterInt(1,5);

            if (option == 1)
            {
                System.out.println("Nothing? Alright bye.");
                Util.pauseConsole();
                Util.clearConsole();
                System.out.println("...You can only talk to Addie and Williams now.");
                System.out.println("Who do you want to talk to?");
                System.out.println("1. Addie\n2. Williams");
                int Choice = Util.enterInt(1, 2);

                if (Choice == 1)
                {
                    System.out.println("You walked towards Addie and said: hello");
                    Util.pauseConsole();
                    Addie();
                }

                if (Choice == 2)
                {
                    System.out.println("You walked toward Jay and said: hello");
                    Util.pauseConsole();
                    Williams();

                }
            }

            if (option == 2)
            {
                Util.clearConsole();
                System.out.println("Jay: That sick, I mean I would probably do something more cool. It feels nice to hang out with you tho");
                System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Jay that you didn't have anywhere to stay.");
                System.out.println("Jay offers you to stay over.");
                Util.pauseConsole();
                YouMadeIt();
            }

            if (option == 3)
            {
                Util.clearConsole();
                System.out.println("Jay: That sick, I mean I would probably do something more cool. It feels nice to hang out with you tho");
                System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Jay that you didn't have anywhere to stay.");
                System.out.println("Jay offers you to stay over.");
                Util.pauseConsole();
                YouMadeIt();
            }

            if (option == 4)
            {
                Util.clearConsole();
                System.out.println("Jay: That sick, I mean I would probably do something more cool. It feels nice to hang out with you tho");
                System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Jay that you didn't have anywhere to stay.");
                System.out.println("Jay offers you to stay over.");
                Util.pauseConsole();
                YouMadeIt();
            }

            if (option == 5)
            {
                Util.clearConsole();
                System.out.println("Jay: That sick, I mean I would probably do something more cool. It feels nice to hang out with you tho");
                System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Jay that you didn't have anywhere to stay.");
                System.out.println("Jay offers you to stay over.");
                Util.pauseConsole();
                YouMadeIt();
            }
        }
        if (choice == 2)
        {
            System.out.println("-1 Heart");
            System.out.println("Jay: Then do you want to go to a park?");
            System.out.println("1. No\n2. Yes");
            int Choice = Util.enterInt(1, 2);

            if (Choice == 1)
            {
                Util.clearConsole();
                System.out.println("Jay: So how did you make it out of the woods");
                System.out.println("1. No comment\n2. I called 911\n3. I played an RPG game and it helped me\n4. I went through a cave of hungry animals and it lend me here\n5. climbed down the edge of a cliff");
                int option = Util.enterInt(1,5);

                if (option == 2)
                {
                    Util.clearConsole();
                    System.out.println("Jay: That sick, I mean I would probably do something more cool.");
                    System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Williams that you didn't have anywhere to stay.");
                    System.out.println("Jay: Sorry but I really can’t do anything about that. You see I don't like when people stay over, but I think saw a hotel nearby maybe you can stay there. Bye..");
                    System.out.println("You went to the hotel and stayed the night.");
                    Util.pauseConsole();
                    YouMadeIt();
                }

                if (option == 3)
                {
                    Util.clearConsole();
                    System.out.println("Jay: That sick, I mean I would probably do something more cool.");
                    System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Williams that you didn't have anywhere to stay.");
                    System.out.println("Jay: Sorry but I really can’t do anything about that. You see I don't like when people stay over, but I think saw a hotel nearby maybe you can stay there. Bye..");
                    System.out.println("You went to the hotel and stayed the night.");
                    Util.pauseConsole();
                    YouMadeIt();
                }

                if (option == 4)
                {
                    Util.clearConsole();
                    System.out.println("Jay: That sick, I mean I would probably do something more cool.");
                    System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Williams that you didn't have anywhere to stay.");
                    System.out.println("Jay: Sorry but I really can’t do anything about that. You see I don't like when people stay over, but I think saw a hotel nearby maybe you can stay there. Bye..");
                    System.out.println("You went to the hotel and stayed the night.");
                    Util.pauseConsole();
                    YouMadeIt();
                }

                if (option == 5)
                {
                    Util.clearConsole();
                    System.out.println("Jay: That sick, I mean I would probably do something more cool.");
                    System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Williams that you didn't have anywhere to stay.");
                    System.out.println("Jay: Sorry but I really can’t do anything about that. You see I don't like when people stay over, but I think saw a hotel nearby maybe you can stay there. Bye..");
                    System.out.println("You went to the hotel and stayed the night.");
                    Util.pauseConsole();
                    YouMadeIt();
                }

            }

            if (Choice == 2)
            {
                System.out.println("Jay: Wow so you really dont wanna hang? I'll just go then.");
                Util.pauseConsole();
                Util.clearConsole();
                System.out.println("...You can only talk to Addie and Williams now.");
                System.out.println("Who do you want to talk to?");
                System.out.println("1. Addie\n2. Williams");
                int choose = Util.enterInt(1, 2);

                if (choose == 1)
                {
                    System.out.println("You walked towards Addie and said: hello");
                    Util.pauseConsole();
                    Addie();
                }

                if (choose == 2)
                {
                    System.out.println("You walked toward Williams and said: hello");
                    Util.pauseConsole();
                    Williams();
                }
            }

        }

    }

    private void YouWon()
    {

        numLives++;

        System.out.println("You won the game or did you really?");
        System.out.println("+1 Life");

        if (numLives > 0)
        {
            Util.pauseConsole();
            Util.clearConsole();
            start();
        }
    }

    private void YouMadeIt()
    {
        Util.clearConsole();
        System.out.println("You made it out of the woods. You finished the game.");
        Util.pauseConsole();
        Util.clearConsole();
        run();

    }

    private void defeat()
    {

        numLives--;

        System.out.println(" ");

        if (numLives > 0)
        {
            start();
        }
        else
        {
            System.out.println("You lost all your lives and did not make it out of out the wood. \nGAME OVER");
            Util.pauseConsole();
            Util.clearConsole();
            run();
        }

    }
}