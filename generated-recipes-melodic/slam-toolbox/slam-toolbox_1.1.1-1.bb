# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "This package provides a sped up improved slam karto with updated SDK and visualization and modification toolsets"
AUTHOR = "Steve Macenski <stevenmacenski@gmail.com>"
ROS_AUTHOR = "Steve Macenski"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=46ee8693f40a89a31023e97ae17ecf19"

ROS_CN = "slam_toolbox"
ROS_BPN = "slam_toolbox"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_tbb} \
    ceres-solver \
    cmake-modules \
    interactive-markers \
    lapack \
    libeigen \
    libg2o \
    message-filters \
    message-generation \
    nav-msgs \
    pluginlib \
    qtbase \
    rosconsole \
    roscpp \
    rviz \
    sensor-msgs \
    sparse-bundle-adjustment \
    std-msgs \
    std-srvs \
    suitesparse-cholmod \
    suitesparse-cxsparse \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_tbb} \
    ceres-solver \
    interactive-markers \
    lapack \
    libeigen \
    libg2o \
    message-filters \
    message-runtime \
    nav-msgs \
    pluginlib \
    qtbase \
    rosconsole \
    roscpp \
    rviz \
    sensor-msgs \
    sparse-bundle-adjustment \
    std-msgs \
    std-srvs \
    suitesparse-cholmod \
    suitesparse-cxsparse \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_tbb} \
    ceres-solver \
    interactive-markers \
    lapack \
    libeigen \
    libg2o \
    message-filters \
    message-runtime \
    nav-msgs \
    pluginlib \
    qtbase \
    rosconsole \
    roscpp \
    rviz \
    sensor-msgs \
    sparse-bundle-adjustment \
    std-msgs \
    std-srvs \
    suitesparse-cholmod \
    suitesparse-cxsparse \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/SteveMacenski/slam_toolbox-release/archive/release/melodic/slam_toolbox/1.1.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "2f7fd14e21a14552a40d94e5eb97390a"
SRC_URI[sha256sum] = "9b4ec2b8a1a940e58ae2b4a196b2b1c476cc89c8f1866df328504fa59858d391"
S = "${WORKDIR}/slam_toolbox-release-release-melodic-slam_toolbox-1.1.1-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('slam-toolbox', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('slam-toolbox', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/slam-toolbox/slam-toolbox_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/slam-toolbox/slam-toolbox-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/slam-toolbox/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/slam-toolbox/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}