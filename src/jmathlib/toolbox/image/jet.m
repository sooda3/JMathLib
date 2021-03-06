## Copyright (C) 1999,2000  Kai Habel
##
## This file is part of Octave.
##
## Octave is free software; you can redistribute it and/or modify it
## under the terms of the GNU General Public License as published by
## the Free Software Foundation; either version 2, or (at your option)
## any later version.
##
## Octave is distributed in the hope that it will be useful, but
## WITHOUT ANY WARRANTY; without even the implied warranty of
## MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
## General Public License for more details.
##
## You should have received a copy of the GNU General Public License
## along with Octave; see the file COPYING.  If not, write to the Free
## Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
## 02110-1301, USA.

## -*- texinfo -*-
## @deftypefn {Function File} {} jet (@var{n})
## Create color colormap. This colormap is dark blue through blue, cyan, 
## green, yellow, red to dark red. The argument @var{n} should be a scalar. 
## If it is omitted, the length of the current colormap or 64 is assumed.
## @seealso{colormap}
## @end deftypefn

## Author:  Kai Habel <kai.habel@gmx.de>

function map = jet (number)

  if (nargin == 0)
    number = rows (colormap);
  elseif (nargin == 1)
    if (! isscalar (number))
      error ("jet: argument must be a scalar");
    endif
  else
    print_usage ();
  endif

  if (number == 1)
    map = [0, 0, 0.5];  
  elseif (number > 1)
    x = linspace(0, 1, number)';
    r = (x >= 3/8 & x < 5/8) .* (4 * x - 3/2)\
      + (x >= 5/8 & x < 7/8) + (x >= 7/8) .* (-4 * x + 9/2);
    g = (x >= 1/8 & x < 3/8) .* (4 * x - 1/2)\
      + (x >= 3/8 & x < 5/8) + (x >= 5/8 & x < 7/8) .* (-4 * x + 7/2);
    b = (x < 1/8) .* (4 * x + 1/2) + (x >= 1/8 & x < 3/8)\
      + (x >= 3/8 & x < 5/8) .* (-4 * x + 5/2);
    map = [r, g, b];
  else
    map = [];
  endif

endfunction

/*
@GROUP
image
@SYNTAX
jet
@DOC
Create color colormap. This colormap is dark blue through blue, cyan, 
green, yellow, red to dark red.
@EXAMPLES
<programlisting>
.
</programlisting>
@SEE
bone, cool, copper, gray, hot, pink, rainbow, spring, summer, white, winter
*/