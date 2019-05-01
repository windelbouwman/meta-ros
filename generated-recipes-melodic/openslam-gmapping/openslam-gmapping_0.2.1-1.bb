# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "The catkinized verseion of openslam_gmapping package (https://github.com/OpenSLAM-org/openslam_gmapping/tree/79ef0b0e6d9a12d6390ae64c4c00d37d776abefb)"
AUTHOR = "ROS Orphaned Package Maintainers <ros-orphaned-packages@googlegroups.com>"
ROS_AUTHOR = "Cyrill Stachniss"
HOMEPAGE = "http://openslam.org/gmapping"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "openslam_gmapping"
ROS_BPN = "openslam_gmapping"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/openslam_gmapping-release/archive/release/melodic/openslam_gmapping/0.2.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "9a0c000db11bf13e630a6d7bfff98ce9"
SRC_URI[sha256sum] = "9b61107d88d219e52ecb210abcb44d5248c760182c4c6bafd39beab1f5c78f5f"
S = "${WORKDIR}/openslam_gmapping-release-release-melodic-openslam_gmapping-0.2.1-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('openslam-gmapping', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('openslam-gmapping', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/openslam-gmapping/openslam-gmapping_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/openslam-gmapping/openslam-gmapping-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/openslam-gmapping/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/openslam-gmapping/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}