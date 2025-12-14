DESCRIPTION = "Utilities for Google Media Downloads and Resumable Uploads"
HOMEPAGE = "https://github.com/googleapis/google-resumable-media-python"
AUTHOR = "Google Cloud Platform"
SECTION = "devel/python"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

inherit pypi python_setuptools_build_meta

PR = "r0"

RDEPENDS:${PN} += "\
    python3-aiohttp \
    python3-google-crc32c \
    python3-requests \
"

SRC_URI[sha256sum] = "f1157ed8b46994d60a1bc432544db62352043113684d4e030ee02e77ebe9a1ae"

PYPI_PACKAGE = "google_resumable_media"
UPSTREAM_CHECK_PYPI_PACKAGE = "${PYPI_PACKAGE}"
