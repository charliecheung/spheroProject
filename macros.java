 // Spin Movement
                //can you hear my heartbeat
                macro.addCommand( new LoopStart( 8)); //four seconds
                macro.addCommand( new RotateOverTime( 180, 500));
                macro.addCommand( new Delay( ( 500  ) ) );
                macro.addCommand( new LoopEnd() );

                // Move Right
                //Set the robot LED to blue
                // RGB (Red,Green,Blue,DELAY)
                macro.addCommand(new LoopStart(4));
                //macro.addCommand( new RGB( 0, 0, 255, 255 ) );
                //Move the robot to the right
                macro.addCommand( new Roll( 0.3f, 90, 0 ) );
                //Wait until the robot should stop moving
                macro.addCommand( new Delay( 500) );
                //Stop
                macro.addCommand( new Roll( 0.0f, 90, 255 ) );

                macro.addCommand( new RotateOverTime( 360, 500));
                macro.addCommand( new Delay( ( 500  ) ) );

                //Move Left
                //Move the robot to the left
                macro.addCommand( new Roll( 0.3f, 270, 0 ) );
                //Wait until the robot should stop moving
                macro.addCommand( new Delay( 500 ) );
                //Stop
                macro.addCommand( new Roll( 0.0f, 270, 255 ) );
                macro.addCommand(new LoopEnd());

                //another spin ccw
                macro.addCommand( new LoopStart( 5));
                macro.addCommand( new RotateOverTime( 360, 500));
                macro.addCommand( new Delay( ( 500  ) ) );
                macro.addCommand( new LoopEnd() );

                //victors part
                macro.addCommand( new LoopStart( 30));
                macro.addCommand( new RotateOverTime( 360, 800));
                macro.addCommand( new Delay( ( 500  ) ) );
                macro.addCommand( new LoopEnd() );
                //Set the robot to roll left
                macro.addCommand( new Roll( 0.0f, 270, 255 ) );
                //you set my heart on fire
                macro.addCommand(new Roll( 1.5f, 0, 0 ));
                //Wait until the robot should stop moving
                macro.addCommand( new Delay( 500) );
                //Stop
                macro.addCommand( new Roll( 0.0f, 0, 255 ) );
                macro.addCommand( new Delay( ( 500  ) ) );
