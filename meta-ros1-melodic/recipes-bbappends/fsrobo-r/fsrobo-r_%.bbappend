# Copyright (c) 2019 LG Electronics, Inc.

PNBLACKLIST[fsrobo-r] = "${@ 'Requires fsrobo-r-moveit-config which depends on moveit-ros-visualization which depends on qtbase which requires meta-qt5 to be included' if 'qt5-layer' not in BBFILE_COLLECTIONS.split() else '' }"