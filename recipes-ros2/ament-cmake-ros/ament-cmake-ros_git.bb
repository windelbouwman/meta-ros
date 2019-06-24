SUMMARY = "The ROS specific CMake bits in the ament buildsystem."
HOMEPAGE = "https://github.com/ros2/ament_cmake_ros"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

SRCREV = "070c7265354dc11ab04faac3b5ec7bb175b9e5d6"
SRC_URI = "git://github.com/ros2/ament_cmake_ros.git;protocol=git;"

inherit ament

BBCLASSEXTEND += "native"
