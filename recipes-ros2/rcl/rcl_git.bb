SUMMARY = "The ROS client library common implementation."
HOMEPAGE = "https://github.com/ros2/rcl_interfaces"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"
DEPENDS = " \
    ament-cmake-ros \
    rcl-interfaces \
    rmw-implementation \
"

SRCREV = "1bf11ed0c2b53090f990262ba4003d63cb1e5460"
SRC_URI = "git://github.com/ros2/rcl.git;protocol=git;"

inherit ament
