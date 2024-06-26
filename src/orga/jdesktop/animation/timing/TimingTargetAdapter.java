/**
 * Copyright (c) 2006, Sun Microsystems, Inc
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * 
 *   * Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *   * Redistributions in binary form must reproduce the above
 *     copyright notice, this list of conditions and the following 
 *     disclaimer in the documentation and/or other materials provided 
 *     with the distribution.
 *   * Neither the name of the TimingFramework project nor the names of its
 *     contributors may be used to endorse or promote products derived 
 *     from this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package orga.jdesktop.animation.timing;

/**
 * Implements the {@link TimingTarget} interface, providing stubs for all
 * TimingTarget methods.  Subclasses may extend this adapter rather than
 * implementing the TimingTarget interface if they only care about a 
 * subset of the events that TimingTarget provides.  For example, 
 * sequencing animations may only require monitoring the 
 * {@link TimingTarget#end} method, so subclasses of this adapter
 * may ignore the other methods such as timingEvent.
 *
 * @author Chet
 */
public class TimingTargetAdapter implements TimingTarget {

    /**
     * This method will receive all of the timing events from an Animator
     * during an animation.  The fraction is the percent elapsed (0 to 1)
     * of the current animation cycle.
     * @param fraction the fraction of completion between the start and
     * end of the current cycle.  Note that on reversing cycles
     * ({@link Animator.Direction#BACKWARD}) the fraction decreases
     * from 1.0 to 0 on backwards-running cycles.  Note also that animations
     * with a duration of {@link Animator#INFINITE INFINITE} will call
     * timingEvent with an undefined value for fraction, since there is
     * no fraction that makes sense if the animation has no defined length.
     * @see Animator.Direction
     */
    public void timingEvent(float fraction) {}

    /**
     * Called when the Animator's animation begins.  This provides a chance
     * for targets to perform any setup required at animation start time.
     */
    public void begin() {}
    
    /**
     * Called when the Animator's animation ends
     */
    public void end() {}
    
    /**
     * Called when the Animator repeats the animation cycle
     */
    public void repeat() {}
    
}
