split the parts
                //another spin ccw
                macro.addCommand( new LoopStart( 3));
                macro.addCommand( new RotateOverTime( 720, 500));
                macro.addCommand( new Delay( ( 500  ) ) );
                macro.addCommand( new LoopEnd() );

                macro.addCommand( new LoopStart( 12));
                macro.addCommand( new RotateOverTime( 540, 800));
                macro.addCommand( new Delay( ( 500  ) ) );
                macro.addCommand( new LoopEnd() );
                //Set the robot to roll left
                macro.addCommand( new Roll( 0.0f, 270, 255 ) );

                macro.addCommand( new LoopStart( 12 ));
                macro.addCommand( new RotateOverTime( 720, 800));
                macro.addCommand( new Delay( ( 500  ) ) );
                macro.addCommand( new LoopEnd() );
                //Set the robot to roll left
                macro.addCommand( new Roll( 0.0f, 270, 255 ) );

                //yes we were born to make history
                // Shake
                macro.addCommand( new LoopStart(10));
                macro.addCommand( new RotateOverTime( 1080, 500));
                macro.addCommand( new Delay( ( 500  ) ) );
                macro.addCommand( new LoopEnd() );
                macro.addCommand( new Delay( ( 500  ) ) );
                macro.addCommand( new Roll( 0.0f, 270, 255 ) );
                macro.addCommand(new Roll( 1.5f, 0, 0 ));
                //Wait until the robot should stop moving
                macro.addCommand( new Delay( 500) );
                //Stop
                macro.addCommand( new Roll( 0.0f, 0, 255 ) );
                macro.addCommand( new Delay( ( 500  ) ) );
                //don't stop us now
                // Shake
                macro.addCommand( new LoopStart(10));
                macro.addCommand( new RotateOverTime( 1080, 500));
                macro.addCommand( new Delay( ( 500  ) ) );
                macro.addCommand( new LoopEnd() );
                macro.addCommand( new Delay( ( 500  ) ) );
                macro.addCommand( new Roll( 0.0f, 270, 255 ) );
                //Move the robot to the back
                macro.addCommand( new Roll( 0.5f, 180, 0 ) );
                //Wait until the robot should stop moving
                macro.addCommand( new Delay( 500 ) );
                //Stop
                macro.addCommand( new Roll( 0.0f, 90, 255 ) );
                //Move the robot to the right
                macro.addCommand( new Roll( 0.5f, 90, 0 ) );
                //Wait until the robot should stop moving
                macro.addCommand( new Delay( 500) );
                //Stop
                macro.addCommand( new Roll( 0.0f, 90, 255 ) );
                //don't stop us now II
                macro.addCommand( new LoopStart( 30));
                macro.addCommand( new RotateOverTime( 540, 800));
                macro.addCommand( new Delay( ( 500  ) ) );
                macro.addCommand( new LoopEnd() );
                //Set the robot to roll left
                macro.addCommand( new Roll( 0.0f, 270, 255 ) );
                macro.addCommand( new Delay ((500)));
                 //another spin ccw
                macro.addCommand( new LoopStart( 8));
                macro.addCommand( new RotateOverTime( 360, 500));
                macro.addCommand( new Delay( ( 500  ) ) );
                macro.addCommand( new LoopEnd() );

                //another spin ccw
                macro.addCommand( new LoopStart( 8));
                macro.addCommand( new RotateOverTime( 720, 500));
                macro.addCommand( new Delay( ( 500  ) ) );
                macro.addCommand( new LoopEnd() );

                //another spin ccw
                macro.addCommand( new LoopStart( 10));
                macro.addCommand( new RotateOverTime( 1080, 500));
                macro.addCommand( new Delay( ( 500  ) ) );
                macro.addCommand( new LoopEnd() );
                macro.addCommand( new Delay( ( 500 ) ) );