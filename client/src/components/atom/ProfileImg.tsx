import { FC } from 'react';
import styled from 'styled-components';
import defaultImg from '../../assets/default.png';

interface ProfileIconProps {
  src?: string;
  width?: string;
}

const ProfileIcon: FC<ProfileIconProps> = ({ src = defaultImg, width }) => {
  return <StyledProfileIcon src={src} width={width} />;
};

export const StyledProfileIcon = styled.img`
  width: ${(props) => props.width || '100px'};
  border-radius: 100%;
`;

export default ProfileIcon;
