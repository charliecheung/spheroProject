				//victors part
				macro.addCommand( new LoopStart(3));
                //Move the robot to the left
                macro.addCommand( new Roll( 0.8f, 270, 0 ) );
                //Wait until the robot should stop moving
                macro.addCommand( new Delay( 500 ) );
                //Stop
                macro.addCommand( new Roll( 0.0f, 270, 255 ) );
                macro.addCommand( new Delay( ( 500 ) ) );
                 //Move the robot to the right
                 macro.addCommand( new Roll( 1.0f, 90, 0 ) );
                 //Wait until the robot should stop moving
                 macro.addCommand( new Delay( 500) );
                 //Stop
                 macro.addCommand( new Roll( 0.0f, 90, 255 ) );
                macro.addCommand( new LoopEnd());
                //another spin ccw
                macro.addCommand( new LoopStart( 14));
                macro.addCommand( new RotateOverTime( 360, 800));
                macro.addCommand( new Delay( ( 500  ) ) );
                macro.addCommand( new LoopEnd() );

                //you set my heart on fire
                macro.addCommand(new Roll( 1.5f, 180, 0 ));
                //Wait until the robot should stop moving
                macro.addCommand( new Delay( 500) );
                //Stop
                macro.addCommand( new Roll( 0.0f, 0, 255 ) );
                macro.addCommand( new Delay( ( 500  ) ) );
                macro.addCommand(new Roll( 1.5f, 0, 0 ));
                //Wait until the robot should stop moving
                macro.addCommand( new Delay( 500) );
                //Stop
                macro.addCommand( new Roll( 0.0f, 0, 255 ) );
                macro.addCommand( new Delay( ( 500  ) ) );